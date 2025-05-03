package kz.lab.valorant_stats_backend.service.strategy;

import kz.lab.valorant_stats_backend.model.generated.EsportsSchedule;
import kz.lab.valorant_stats_backend.model.generated.MatchHistory;
import reactor.core.publisher.Mono;

/**
 * Интерфейс для стратегий получения данных из Valorant API.
 */
public interface ValorantApiStrategy {
    /**
     * Асинхронно извлекает историю матчей игрока по имени и тегу.
     *
     * @param region   регион игрока (например, "eu")
     * @param platform платформа игрока (например, "pc")
     * @param name     имя игрока
     * @param tag      тег игрока
     * @return {@link Mono} с историей матчей
     */
    Mono<MatchHistory> fetchMatchHistoryByNameTag(String region, String platform, String name, String tag);

    /**
     * Асинхронно извлекает историю матчей игрока.
     *
     * @param region регион игрока (например, "eu")
     * @param puuid  уникальный идентификатор игрока
     * @return {@link Mono} с историей матчей
     */
    Mono<MatchHistory> fetchMatchHistory(String region, String puuid);


    /**
     * Асинхронно извлекает расписание киберспортивных событий.
     *
     * @return {@link Mono} с расписанием событий
     */
    Mono<EsportsSchedule> fetchEsportsSchedule();
}