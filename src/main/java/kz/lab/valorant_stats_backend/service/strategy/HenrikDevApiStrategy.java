package kz.lab.valorant_stats_backend.service.strategy;

import kz.lab.valorant_stats_backend.model.generated.EsportsSchedule;
import kz.lab.valorant_stats_backend.model.generated.MatchHistory;
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

    /**
     * Конструктор для инициализации стратегии.
     *
     * @param webClient клиент для выполнения HTTP-запросов
     * @param apiUrl    базовый URL API (из конфигурации)
     * @param apiKey    ключ авторизации API (из конфигурации)
     */
    public HenrikDevApiStrategy(WebClient webClient,
                                @Value("${henrikdev.api.url}") String apiUrl, // *** Изменено ***
                                @Value("${henrikdev.api.key}") String apiKey) { // *** Изменено ***
        this.webClient = webClient;
        this.apiUrl = apiUrl;
        this.apiKey = apiKey;
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
    public Mono<MatchHistory> fetchMatchHistoryByNameTag(String region, String platform, String name, String tag) {
        String url = String.format("%s/v4/matches/%s/%s/%s/%s", apiUrl, region, platform, name, tag);
        log.info("Fetching match history from URL: {}", url);
        return webClient.get()
                .uri(url)
                .header("Authorization", apiKey)
                .accept(org.springframework.http.MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(MatchHistory.class)
                .onErrorResume(e -> {
                    log.error("Failed to fetch match history for region: {}, platform: {}, name: {}, tag: {}. Error: {}",
                            region, platform, name, tag, e.getMessage());
                    return Mono.empty();
                });
    }

    // *** Добавлено: метод для получения расписания киберспортивных событий ***

    /**
     * Асинхронно извлекает расписание киберспортивных событий.
     * <p>
     * Выполняет GET-запрос к endpoint'у `/valorant/v1/esports/schedule`.
     * В случае ошибки логирует сообщение и возвращает пустой Mono.
     *
     * @return {@link Mono} с расписанием событий
     */
    @Override
    public Mono<EsportsSchedule> fetchEsportsSchedule() {
        String url = String.format("%s/v1/esports/schedule", apiUrl);
        log.info("Fetching esports schedule from URL: {}", url);
        return webClient.get()
                .uri(url)
                .header("Authorization", apiKey)
                .accept(org.springframework.http.MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(EsportsSchedule.class)
                .onErrorResume(e -> {
                    log.error("Failed to fetch esports schedule: {}", e.getMessage());
                    return Mono.empty();
                });
    }
}