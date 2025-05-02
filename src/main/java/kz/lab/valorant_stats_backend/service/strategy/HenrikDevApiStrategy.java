package kz.lab.valorant_stats_backend.service.strategy;

import kz.lab.valorant_stats_backend.model.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

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

    /**
     * Конструктор для инициализации стратегии.
     *
     * @param webClient клиент для выполнения HTTP-запросов
     * @param apiUrl    базовый URL API (из конфигурации)
     * @param apiKey    ключ авторизации API (из конфигурации)
     */
    public HenrikDevApiStrategy(WebClient webClient,
                                @Value("${valorant.api.url}") String apiUrl,
                                @Value("${valorant.api.key}") String apiKey) {
        this.webClient = webClient;
        this.apiUrl = apiUrl;
        this.apiKey = apiKey;
    }

    @Override
    public Mono<List<Player>> fetchPlayerStats(String region, String puuid) {
        String url = String.format("%s/v3/by-puuid/matches/%s/%s", apiUrl, region, puuid);
        log.info("Fetching player stats from URL: {}", url);
        return webClient.get()
                .uri(url)
                .header("Authorization", apiKey)
                .retrieve()
                .bodyToMono(MatchHistory.class)
                .map(response -> response.getData().stream()
                        .flatMap(match -> match.getPlayers().getAllPlayers().stream())
                        .collect(Collectors.toList()))
                .onErrorResume(e -> {
                    log.error("Failed to fetch player stats: {}", e.getMessage());
                    return Mono.just(List.of());
                });
    }

    @Override
    public Mono<AccountDetails> fetchAccountDetails(String puuid) {
        String url = String.format("%s/v1/by-puuid/account/%s", apiUrl, puuid);
        log.info("Fetching account details from URL: {}", url);
        return webClient.get()
                .uri(url)
                .header("Authorization", apiKey)
                .retrieve()
                .bodyToMono(AccountDetails.class)
                .onErrorResume(e -> {
                    log.error("Failed to fetch account details: {}", e.getMessage());
                    return Mono.empty();
                });
    }

    @Override
    public Mono<AccountDetails> fetchAccountDetailsByNameTag(String name, String tag) {
        String url = String.format("%s/v1/account/%s/%s", apiUrl, name, tag);
        log.info("Fetching account details by name and tag from URL: {}", url);
        return webClient.get()
                .uri(url)
                .header("Authorization", apiKey)
                .retrieve()
                .bodyToMono(AccountDetails.class)
                .onErrorResume(e -> {
                    log.error("Failed to fetch account details by name and tag: {}", e.getMessage());
                    return Mono.empty();
                });
    }

    @Override
    public Mono<MatchHistory> fetchMatchHistory(String region, String puuid) {
        String url = String.format("%s/v3/by-puuid/matches/%s/%s", apiUrl, region, puuid);
        log.info("Fetching match history from URL: {}", url);
        return webClient.get()
                .uri(url)
                .header("Authorization", apiKey)
                .retrieve()
                .bodyToMono(MatchHistory.class)
                .onErrorResume(e -> {
                    log.error("Failed to fetch match history: {}", e.getMessage());
                    return Mono.empty();
                });
    }

    @Override
    public Mono<MMRDetails> fetchMMRDetails(String region, String puuid) {
        String url = String.format("%s/v1/by-puuid/mmr/%s/%s", apiUrl, region, puuid);
        log.info("Fetching MMR details from URL: {}", url);
        return webClient.get()
                .uri(url)
                .header("Authorization", apiKey)
                .retrieve()
                .bodyToMono(MMRDetails.class)
                .onErrorResume(e -> {
                    log.error("Failed to fetch MMR details: {}", e.getMessage());
                    return Mono.empty();
                });
    }

    /**
     * Асинхронно извлекает данные лидерборда для указанного региона и платформы.
     * <p>
     * Использует WebClient для выполнения GET-запроса к endpoint'у `/v3/leaderboard/{region}/{platform}`.
     * Ограничивает количество возвращаемых игроков до 500.
     * В случае ошибки логирует полный ответ API для отладки.
     *
     * @param region   регион лидерборда (например, "eu")
     * @param platform платформа (например, "pc")
     * @return {@link Mono} с данными лидерборда или ошибкой
     */
    @Override
    public Mono<LeaderboardResponse> fetchLeaderboard(String region, String platform) {
        log.info("Fetching leaderboard for region: {}, platform: {}", region, platform);
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/v3/leaderboard/{region}/{platform}")
                        // Добавлено: параметр size для ограничения количества записей
                        .queryParam("size", MAX_PLAYERS_LIMIT)
                        .build(region, platform))
                .header("Authorization", apiKey)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(LeaderboardResponse.class)
                .map(response -> {
                    // Добавлено: ограничение списка игроков до 500
                    List<LeaderboardPlayerDetailed> limitedPlayers = response.getData().getPlayers().stream()
                            .limit(MAX_PLAYERS_LIMIT)
                            .collect(Collectors.toList());
                    response.getData().setPlayers(limitedPlayers);
                    return response;
                })
                .doOnNext(resp -> log.debug("Successfully fetched leaderboard: {}", resp))
                .onErrorResume(e -> {
                    log.error("Failed to fetch leaderboard for region: {}, platform: {}. Error: {}",
                            region, platform, e.getMessage());
                    return webClient.get()
                            .uri(uriBuilder -> uriBuilder
                                    .path("/v3/leaderboard/{region}/{platform}")
                                    .queryParam("size", MAX_PLAYERS_LIMIT)
                                    .build(region, platform))
                            .header("Authorization", apiKey)
                            .accept(MediaType.APPLICATION_JSON)
                            .retrieve()
                            .bodyToMono(String.class)
                            .doOnNext(response -> log.error("Raw API response: {}", response))
                            .flatMap(response -> Mono.error(new RuntimeException(
                                    "Failed to deserialize leaderboard: " + e.getMessage())));
                });
    }
}