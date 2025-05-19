package kz.lab.valorant_stats_backend.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import kz.lab.valorant_stats_backend.model.generated.MatchHistory;
import kz.lab.valorant_stats_backend.service.factory.ValorantApiStrategyFactory;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Сервис для получения статистики игроков Valorant.
 */
@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ValorantStatsService {
    ValorantApiStrategyFactory strategyFactory;

    /**
     * Асинхронно получает историю матчей игрока по имени и тегу.
     *
     * @param region   регион игрока (например, "eu")
     * @param platform платформа игрока (например, "pc")
     * @param name     имя игрока
     * @param tag      тег игрока
     * @param apiName  имя API (по умолчанию "henrikdev")
     * @return {@link Mono} с историей матчей
     */
    public Mono<JsonNode> getMatchHistoryByNameTag(String region, String platform, String name, String tag, String apiName) {
        log.info("Requesting match history for region: {}, platform: {}, name: {}, tag: {}, api: {}",
                region, platform, name, tag, apiName);
        return strategyFactory.getStrategy(apiName)
                .fetchMatchHistoryByNameTag(region, platform, name, tag);
    }

    public Mono<JsonNode> getEsportsSchedule(String apiName) {
        log.info("Requesting match esports schedule: api: {}", apiName);
        return strategyFactory.getStrategy(apiName)
                .fetchEsportsSchedule();
    }

    public Mono<JsonNode> getPlayers(String apiName) {
        log.info("start players");
        return strategyFactory.getStrategy(apiName)
                .fetchPlayers();
    }

    public Mono<JsonNode> getTeam(String apiName, String teamName) {
        log.info("start team");
        return strategyFactory.getStrategy(apiName)
                .fetchTeam(teamName);
    }

//    /**
//     * Асинхронно получает статистику игроков из указанного API.
//     *
//     * @param region  регион игрока (например, "eu")
//     * @param puuid   уникальный идентификатор игрока
//     * @param apiName имя API (по умолчанию "henrikdev")
//     * @return {@link Mono} со списком игроков
//     */
//    public Mono<List<Player>> getPlayerStats(String region, String puuid, String apiName) {
//        log.info("Requesting player stats for region: {}, puuid: {}, api: {}", region, puuid, apiName);
//        return strategyFactory.getStrategy(apiName)
//                .fetchPlayerStats(region, puuid);
//    }
//
//    /**
//     * Асинхронно получает детали аккаунта игрока.
//     *
//     * @param puuid   уникальный идентификатор игрока
//     * @param apiName имя API (по умолчанию "henrikdev")
//     * @return {@link Mono} с данными аккаунта
//     */
//    public Mono<AccountDetails> getAccountDetails(String puuid, String apiName) {
//        log.info("Requesting account details for puuid: {}, api: {}", puuid, apiName);
//        return strategyFactory.getStrategy(apiName)
//                .fetchAccountDetails(puuid);
//    }
//
//    public Mono<AccountDetails> getAccountDetailsByNameTag(String name, String tag, String apiName) {
//        log.info("Requesting account details for name: {}, tag: {}, api: {}", name, tag, apiName);
//        return strategyFactory.getStrategy(apiName).fetchAccountDetailsByNameTag(name, tag);
//    }

    /**
     * Асинхронно получает историю матчей игрока.
     *
     * @param region  регион игрока (например, "eu")
     * @param puuid   уникальный идентификатор игрока
     * @param apiName имя API (по умолчанию "henrikdev")
     * @return {@link Mono} с историей матчей
     */
    public Mono<MatchHistory> getMatchHistory(String region, String puuid, String apiName) {
        log.info("Requesting match history for region: {}, puuid: {}, api: {}", region, puuid, apiName);
        return strategyFactory.getStrategy(apiName)
                .fetchMatchHistory(region, puuid);
    }

//    /**
//     * Асинхронно получает MMR игрока.
//     *
//     * @param region  регион игрока (например, "eu")
//     * @param puuid   уникальный идентификатор игрока
//     * @param apiName имя API (по умолчанию "henrikdev")
//     * @return {@link Mono} с данными MMR
//     */
//    public Mono<MMRDetails> getMMRDetails(String region, String puuid, String apiName) {
//        log.info("Requesting MMR details for region: {}, puuid: {}, api: {}", region, puuid, apiName);
//        return strategyFactory.getStrategy(apiName)
//                .fetchMMRDetails(region, puuid);
//    }
//
//    /**
//     * Асинхронно получает лидерборд.
//     *
//     * @param region   регион лидерборда (например, "eu")
//     * @param apiName  имя API (по умолчанию "henrikdev")
//     * @param platform
//     * @return {@link Mono} с данными лидерборда
//     */
//    public Mono<LeaderboardResponse> getLeaderboard(String region, String apiName, String platform) {
//        log.info("Requesting leaderboard for region: {}, api: {}, platform : {}", region, apiName, platform);
//        return strategyFactory.getStrategy(apiName)
//                .fetchLeaderboard(region, platform);
//    }
}

