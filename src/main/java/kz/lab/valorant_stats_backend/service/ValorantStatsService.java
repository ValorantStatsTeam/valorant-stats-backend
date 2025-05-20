package kz.lab.valorant_stats_backend.service;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import kz.lab.valorant_stats_backend.service.factory.ValorantApiStrategyFactory;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Map;

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

    /**
     * Асинхронно получает список матчей Valorant с фильтрацией.
     *
     * @param apiName     имя API (по умолчанию "pandascore")
     * @return {@link Mono} с данными матчей
     */
    public Mono<JsonNode> getMatches(String apiName, String matchId, String matchName, String beginAt) {
        log.info("Fetching matches with matchId: {}, matchName: {}, beginAt: {}", matchId, matchName, beginAt);
        return strategyFactory.getStrategy(apiName)
                .fetchMatches(matchId, matchName, beginAt);
    }
}

