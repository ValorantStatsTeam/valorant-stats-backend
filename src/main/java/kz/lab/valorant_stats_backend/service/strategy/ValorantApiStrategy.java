package kz.lab.valorant_stats_backend.service.strategy;

import kz.lab.valorant_stats_backend.model.generated.MatchHistory;
import kz.lab.valorant_stats_backend.model.generated.Player;
import reactor.core.publisher.Mono;

import java.util.List;

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

//    /**
//     * Асинхронно извлекает статистику игроков из матчей.
//     *
//     * @param region регион игрока (например, "eu")
//     * @param puuid  уникальный идентификатор игрока
//     * @return {@link Mono} со списком игроков
//     */
//    Mono<List<Player>> fetchPlayerStats(String region, String puuid);

//    /**
//     * Асинхронно извлекает детали аккаунта игрока.
//     *
//     * @param puuid уникальный идентификатор игрока
//     * @return {@link Mono} с данными аккаунта
//     */
//    Mono<AccountDetails> fetchAccountDetails(String puuid);
//
//    Mono<AccountDetails> fetchAccountDetailsByNameTag(String name, String tag);

    /**
     * Асинхронно извлекает историю матчей игрока.
     *
     * @param region регион игрока (например, "eu")
     * @param puuid  уникальный идентификатор игрока
     * @return {@link Mono} с историей матчей
     */
    Mono<MatchHistory> fetchMatchHistory(String region, String puuid);

//    /**
//     * Асинхронно извлекает MMR игрока.
//     *
//     * @param region регион игрока (например, "eu")
//     * @param puuid  уникальный идентификатор игрока
//     * @return {@link Mono} с данными MMR
//     */
//    Mono<MMRDetails> fetchMMRDetails(String region, String puuid);
//
//    /**
//     * Асинхронно извлекает лидерборд.
//     *
//     * @param region регион лидерборда (например, "eu")
//     * @return {@link Mono} с данными лидерборда
//     */
//    Mono<LeaderboardResponse> fetchLeaderboard(String region, String platform);
}
