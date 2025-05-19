package kz.lab.valorant_stats_backend.service.strategy;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Интерфейс для стратегий получения данных из Valorant API.
 */
public interface ValorantApiStrategy {

    Mono<JsonNode> fetchPlayers();

    Mono<JsonNode> fetchTeam(String teamName);

    Mono<JsonNode> fetchMatchHistoryByNameTag(String region, String platform, String name, String tag);

    Mono<JsonNode> fetchEsportsSchedule();

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
   // Mono<MatchHistory> fetchMatchHistory(String region, String puuid);

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
