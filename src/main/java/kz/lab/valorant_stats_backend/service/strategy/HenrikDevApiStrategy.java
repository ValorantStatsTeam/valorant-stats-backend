package kz.lab.valorant_stats_backend.service.strategy;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
//import kz.lab.valorant_stats_backend.model.generated.MatchHistory;
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
public class HenrikDevApiStrategy implements ValorantApiStrategy {
    WebClient webClient;
    String apiUrl;
    String apiKey;
    // Добавлено: константа для ограничения количества пользователей
    private static final int MAX_PLAYERS_LIMIT = 500;
    private final ObjectMapper objectMapper;

    /**
     * Конструктор для инициализации стратегии.
     *
     * @param webClient клиент для выполнения HTTP-запросов
     * @param apiUrl    базовый URL API (из конфигурации)
     * @param apiKey    ключ авторизации API (из конфигурации)
     */
    public HenrikDevApiStrategy(WebClient webClient,
                                @Value("${valorant.api.url}") String apiUrl,
                                @Value("${valorant.api.key}") String apiKey, ObjectMapper objectMapper) {
        this.webClient = webClient;
        this.apiUrl = apiUrl;
        this.apiKey = apiKey;
        this.objectMapper = objectMapper;
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




    //    @Override
//    public Mono<List<Player>> fetchPlayerStats(String region, String puuid) {
//        String url = String.format("%s/v3/by-puuid/matches/%s/%s", apiUrl, region, puuid);
//        log.info("Fetching player stats from URL: {}", url);
//        return webClient.get()
//                .uri(url)
//                .header("Authorization", apiKey)
//                .retrieve()
//                .bodyToMono(MatchHistory.class)
//                .map(response -> response.getData().stream()
//                        .flatMap(match -> match.getPlayers().getAllPlayers().stream())
//                        .collect(Collectors.toList()))
//                .onErrorResume(e -> {
//                    log.error("Failed to fetch player stats: {}", e.getMessage());
//                    return Mono.just(List.of());
//                });
//    }

//    @Override
//    public Mono<AccountDetails> fetchAccountDetails(String puuid) {
//        String url = String.format("%s/v1/by-puuid/account/%s", apiUrl, puuid);
//        log.info("Fetching account details from URL: {}", url);
//        return webClient.get()
//                .uri(url)
//                .header("Authorization", apiKey)
//                .retrieve()
//                .bodyToMono(AccountDetails.class)
//                .onErrorResume(e -> {
//                    log.error("Failed to fetch account details: {}", e.getMessage());
//                    return Mono.empty();
//                });
//    }
//
//    @Override
//    public Mono<AccountDetails> fetchAccountDetailsByNameTag(String name, String tag) {
//        String url = String.format("%s/v1/account/%s/%s", apiUrl, name, tag);
//        log.info("Fetching account details by name and tag from URL: {}", url);
//        return webClient.get()
//                .uri(url)
//                .header("Authorization", apiKey)
//                .retrieve()
//                .bodyToMono(AccountDetails.class)
//                .onErrorResume(e -> {
//                    log.error("Failed to fetch account details by name and tag: {}", e.getMessage());
//                    return Mono.empty();
//                });
//    }

//    @Override
//    public Mono<MatchHistory> fetchMatchHistory(String region, String puuid) {
//        String url = String.format("%s/v3/by-puuid/matches/%s/%s", apiUrl, region, puuid);
//        log.info("Fetching match history from URL: {}", url);
//        return webClient.get()
//                .uri(url)
//                .header("Authorization", apiKey)
//                .retrieve()
//                .bodyToMono(MatchHistory.class)
//                .onErrorResume(e -> {
//                    log.error("Failed to fetch match history: {}", e.getMessage());
//                    return Mono.empty();
//                });
//    }

//    @Override
//    public Mono<MMRDetails> fetchMMRDetails(String region, String puuid) {
//        String url = String.format("%s/v1/by-puuid/mmr/%s/%s", apiUrl, region, puuid);
//        log.info("Fetching MMR details from URL: {}", url);
//        return webClient.get()
//                .uri(url)
//                .header("Authorization", apiKey)
//                .retrieve()
//                .bodyToMono(MMRDetails.class)
//                .onErrorResume(e -> {
//                    log.error("Failed to fetch MMR details: {}", e.getMessage());
//                    return Mono.empty();
//                });
//    }
//
//    /**
//     * Асинхронно извлекает данные лидерборда для указанного региона и платформы.
//     * <p>
//     * Использует WebClient для выполнения GET-запроса к endpoint'у `/v3/leaderboard/{region}/{platform}`.
//     * Ограничивает количество возвращаемых игроков до 500.
//     * В случае ошибки логирует полный ответ API для отладки.
//     *
//     * @param region   регион лидерборда (например, "eu")
//     * @param platform платформа (например, "pc")
//     * @return {@link Mono} с данными лидерборда или ошибкой
//     */
//    @Override
//    public Mono<LeaderboardResponse> fetchLeaderboard(String region, String platform) {
//        log.info("Fetching leaderboard for region: {}, platform: {}", region, platform);
//        return webClient.get()
//                .uri(uriBuilder -> uriBuilder
//                        .path("/v3/leaderboard/{region}/{platform}")
//                        // Добавлено: параметр size для ограничения количества записей
//                        .queryParam("size", MAX_PLAYERS_LIMIT)
//                        .build(region, platform))
//                .header("Authorization", apiKey)
//                .accept(MediaType.APPLICATION_JSON)
//                .retrieve()
//                .bodyToMono(LeaderboardResponse.class)
//                .map(response -> {
//                    // Добавлено: ограничение списка игроков до 500
//                    List<LeaderboardPlayerDetailed> limitedPlayers = response.getData().getPlayers().stream()
//                            .limit(MAX_PLAYERS_LIMIT)
//                            .collect(Collectors.toList());
//                    response.getData().setPlayers(limitedPlayers);
//                    return response;
//                })
//                .doOnNext(resp -> log.debug("Successfully fetched leaderboard: {}", resp))
//                .onErrorResume(e -> {
//                    log.error("Failed to fetch leaderboard for region: {}, platform: {}. Error: {}",
//                            region, platform, e.getMessage());
//                    return webClient.get()
//                            .uri(uriBuilder -> uriBuilder
//                                    .path("/v3/leaderboard/{region}/{platform}")
//                                    .queryParam("size", MAX_PLAYERS_LIMIT)
//                                    .build(region, platform))
//                            .header("Authorization", apiKey)
//                            .accept(MediaType.APPLICATION_JSON)
//                            .retrieve()
//                            .bodyToMono(String.class)
//                            .doOnNext(response -> log.error("Raw API response: {}", response))
//                            .flatMap(response -> Mono.error(new RuntimeException(
//                                    "Failed to deserialize leaderboard: " + e.getMessage())));
//                });
//    }
}