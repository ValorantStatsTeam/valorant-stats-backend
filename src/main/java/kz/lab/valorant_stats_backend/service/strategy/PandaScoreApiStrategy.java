package kz.lab.valorant_stats_backend.service.strategy;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * Стратегия для получения данных из HenrikDev Valorant API.
 * <p>
 * Реализует асинхронные запросы к API с использованием WebClient.
 * Поддерживает обработку ошибок и логирование.
 */
@Slf4j
@Component
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class PandaScoreApiStrategy implements ValorantApiStrategy {
    WebClient webClient;
    String apiUrl;
    String apiKey;

    static int MAX_PLAYERS_LIMIT = 500;
    static String MATCHES_ENDPOINT = "/valorant/matches";
    ObjectMapper objectMapper;

    /**
     * Конструктор для инициализации стратегии.
     *
     * @param webClient клиент для выполнения HTTP-запросов
     * @param apiUrl    базовый URL API (из конфигурации)
     * @param apiKey    ключ авторизации API (из конфигурации)
     */
    public PandaScoreApiStrategy(WebClient webClient,
                                 @Value("${valorant.api.url}") String apiUrl,
                                 @Value("${valorant.api.key}") String apiKey, ObjectMapper objectMapper) {
        this.webClient = webClient;
        this.apiUrl = apiUrl;
        this.apiKey = apiKey;
        this.objectMapper = objectMapper;
    }

    /**
     * Асинхронно получает список матчей Valorant с возможностью фильтрации.
     * Использует параметры запроса для фильтрации, таких как ID матча, название и т.д.
     * Добавляет токен авторизации в запрос.
     *
     * @return {@link Mono} с данными матчей в формате JSON
     */
    @Override
    public Mono<JsonNode> fetchMatches(String matchId, String matchName, String beginAt) {
        StringBuilder url = new StringBuilder(String.format("%s/matches", apiUrl));
        if (matchId != null || matchName != null || beginAt != null) {
            url.append(String.format("?filter[name]=%s", matchName));
        }
        log.info("Fetching Matches from URL: {}", url);
        return webClient.get()
                .uri(url.toString())
                .header("Authorization", apiKey)
                .accept(org.springframework.http.MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .map(jsonString -> {
                    try {
                        // Парсим String(JSON) в JsonNode
                        JsonNode rootNode = objectMapper.readTree(jsonString);

                        // Проверяем, является ли rootNode массивом
                        if (!rootNode.isArray()) {
                            log.error("Expected JSON array, but received: {}", rootNode.getNodeType());
                            return objectMapper.createArrayNode();
                        }

                        // Извлекаем первые 10 элементов массива
                        ArrayNode filteredArray = objectMapper.createArrayNode();
                        int limit = Math.min(10, rootNode.size());
                        for (int i = 0; i < limit; i++) {
                            filteredArray.add(rootNode.get(i));
                        }

                        return (JsonNode) filteredArray;
                    } catch (Exception e) {
                        log.error("Failed to parse JSON: {}", e.getMessage());
                        return objectMapper.createArrayNode();
                    }
                })
                .onErrorResume(e -> {
                    log.error("Failed to fetch teams: {}", e.getMessage());
                    return Mono.empty();
                });
    }

    /**
     * Асинхронно извлекает историю матчей игрока по имени и тегу.
     * <p>
     * Выполняет GET-запрос к endpoint'у `/valorant/v4/matches/{region}/{platform}/{name}/{tag}`.
     * В случае ошибки логирует сообщение и возвращает пустой Mono.
     *
     * @param region   регион игрока (например, "eu")
     * @param platform платформа игрока (например, "pc")
     * @param name     имя игрока
     * @param tag      тег игрока
     * @return {@link Mono} с историей матчей
     */
    @Override
    public Mono<JsonNode> fetchMatchHistoryByNameTag(String region, String platform, String name, String tag) {
        String url = String.format("%s/v4/matches/%s/%s/%s/%s", apiUrl, region, platform, name, tag);
        log.info("Fetching match history from URL: {}", url);
        return webClient.get()
                .uri(url)
                .header("Authorization", apiKey)
                .accept(org.springframework.http.MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .map(jsonString -> {
                    try {
                        // Парсим JSON в JsonNode
                        JsonNode rootNode = objectMapper.readTree(jsonString);

                        // Извлекаем только нужные поля
                        JsonNode filteredNode = objectMapper.createObjectNode()
                                .put("matchId", rootNode.path("data").get(0).path("metadata").path("match_id").asText())
                                //.put("gameMode", rootNode.path("data").path("gameMode").asText())
                                // Добавьте другие поля по необходимости
                                // Например: .put("playerCount", rootNode.path("data").path("playerCount").asInt())
                                ;

                        return filteredNode;
                    } catch (Exception e) {
                        log.error("Failed to parse JSON for region: {}, platform: {}, name: {}, tag: {}. Error: {}",
                                region, platform, name, tag, e.getMessage());
                        return objectMapper.createObjectNode(); // Возвращаем пустой JsonNode при ошибке
                    }
                })
                .onErrorResume(e -> {
                    log.error("Failed to fetch match history for region: {}, platform: {}, name: {}, tag: {}. Error: {}",
                            region, platform, name, tag, e.getMessage());
                    return Mono.empty();
                });
    }

    @Override
    public Mono<JsonNode> fetchPlayers() {
        String url = String.format("%s/players", apiUrl);
        log.info("Fetching players from URL: {}", url);
        return webClient.get()
                .uri(url)
                .header("Authorization", apiKey)
                .accept(org.springframework.http.MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .map(jsonString -> {
                    try {
                        // Парсим String(JSON) в JsonNode
                        JsonNode rootNode = objectMapper.readTree(jsonString);

                        // Проверяем, является ли rootNode массивом
                        if (!rootNode.isArray()) {
                            log.error("Expected JSON array, but received: {}", rootNode.getNodeType());
                            return objectMapper.createObjectNode();
                        }

                        // Извлекаем первые 10 элементов массива
                        ArrayNode filteredArray = objectMapper.createArrayNode();
                        int limit = Math.min(10, rootNode.size());
                        for (int i = 0; i < limit; i++) {
                            filteredArray.add(rootNode.get(i));
                        }

                        return (JsonNode) filteredArray;
                    } catch (Exception e) {
                        log.error("Failed to parse JSON: {}", e.getMessage());
                        return objectMapper.createObjectNode(); // Возвращаем пустой JsonNode при ошибке
                    }
                })
                .onErrorResume(e -> {
                    log.error("Failed to fetch players: {}", e.getMessage());
                    return Mono.empty();
                });
    }

    @Override
    public Mono<JsonNode> fetchTeam(String teamName) {
        StringBuilder url = new StringBuilder(String.format("%s/teams", apiUrl));
        if (teamName != null && !teamName.isEmpty()) {
            url.append(String.format("?filter[name]=%s", teamName));
        }
        log.info("Fetching teams from URL: {}", url);
        return webClient.get()
                .uri(url.toString())
                .header("Authorization", apiKey)
                .accept(org.springframework.http.MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .map(jsonString -> {
                    try {
                        // Парсим String(JSON) в JsonNode
                        JsonNode rootNode = objectMapper.readTree(jsonString);

                        // Проверяем, является ли rootNode массивом
                        if (!rootNode.isArray()) {
                            log.error("Expected JSON array, but received: {}", rootNode.getNodeType());
                            return objectMapper.createArrayNode();
                        }

                        // Извлекаем первые 10 элементов массива
                        ArrayNode filteredArray = objectMapper.createArrayNode();
                        int limit = Math.min(10, rootNode.size());
                        for (int i = 0; i < limit; i++) {
                            filteredArray.add(rootNode.get(i));
                        }

                        return (JsonNode) filteredArray;
                    } catch (Exception e) {
                        log.error("Failed to parse JSON: {}", e.getMessage());
                        return objectMapper.createArrayNode();
                    }
                })
                .onErrorResume(e -> {
                    log.error("Failed to fetch teams: {}", e.getMessage());
                    return Mono.empty();
                });
    }

    @Override
    public Mono<JsonNode> fetchEsportsSchedule() {
        String url = String.format("%s/v1/esports/schedule", apiUrl);
        log.info("Fetching esports schedule from URL: {}", url);

        return null;
    }
}