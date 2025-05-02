package kz.lab.valorant_stats_backend.controller.rest;

import kz.lab.valorant_stats_backend.model.generated.MatchHistory;
import kz.lab.valorant_stats_backend.service.ValorantStatsService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * REST контроллер для предоставления статистики Valorant.
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ValorantStatsController {
    ValorantStatsService statsService;

    /**
     * Получает историю матчей игрока по имени и тегу.
     *
     * @param region   регион игрока (например, "eu")
     * @param platform платформа игрока (например, "pc")
     * @param name     имя игрока
     * @param tag      тег игрока
     * @param apiName  имя API (по умолчанию "henrikdev")
     * @return {@link Mono} с {@link ResponseEntity}, содержащим историю матчей
     */
    @GetMapping("/v4/matches")
    public Mono<ResponseEntity<MatchHistory>> getMatchHistoryByNameTag(
            @RequestParam String region,
            @RequestParam String platform,
            @RequestParam String name,
            @RequestParam String tag,
            @RequestParam(defaultValue = "henrikdev") String apiName) {
        log.info("Received request for match history: region={}, platform={}, name={}, tag={}, api={}",
                region, platform, name, tag, apiName);
        return statsService.getMatchHistoryByNameTag(region, platform, name, tag, apiName)
                .map(ResponseEntity::ok);
    }


//    /**
//     * Получает статистику игроков из матчей.
//     *
//     * @param region  регион игрока (например, "eu")
//     * @param puuid   уникальный идентификатор игрока
//     * @param apiName имя API (по умолчанию "henrikdev")
//     * @return {@link Mono} с {@link ResponseEntity}, содержащим список игроков
//     */
//    @GetMapping("/api/players")
//    public Mono<ResponseEntity<List<Player>>> getPlayers(
//            @RequestParam String region,
//            @RequestParam String puuid,
//            @RequestParam(defaultValue = "henrikdev") String apiName) {
//        log.info("Received request for players: region={}, puuid={}, api={}", region, puuid, apiName);
//        return statsService.getPlayerStats(region, puuid, apiName)
//                .map(ResponseEntity::ok)
//                .defaultIfEmpty(ResponseEntity.notFound().build());
//    }
//
//    /**
//     * Получает детали аккаунта игрока.
//     *
//     * @param puuid   уникальный идентификатор игрока
//     * @param apiName имя API (по умолчанию "henrikdev")
//     * @return {@link Mono} с {@link ResponseEntity}, содержащим данные аккаунта
//     */
//    @GetMapping("/api/account")
//    public Mono<ResponseEntity<AccountDetails>> getAccountDetails(
//            @RequestParam String puuid,
//            @RequestParam(defaultValue = "henrikdev") String apiName) {
//        log.info("Received request for account details: puuid={}, api={}", puuid, apiName);
//        return statsService.getAccountDetails(puuid, apiName)
//                .map(ResponseEntity::ok)
//                .defaultIfEmpty(ResponseEntity.notFound().build());
//    }
//
//    @GetMapping("/api/account/by-name-tag")
//    public Mono<ResponseEntity<AccountDetails>> getAccountDetailsByNameTag(
//            @RequestParam String name,
//            @RequestParam String tag,
//            @RequestParam(defaultValue = "henrikdev") String apiName) {
//        log.info("Received request for account details by name and tag: name={}, tag={}, api={}", name, tag, apiName);
//        return statsService.getAccountDetailsByNameTag(name, tag, apiName)
//                .map(ResponseEntity::ok)
//                .defaultIfEmpty(ResponseEntity.notFound().build());
//    }
//
//    /**
//     * Получает историю матчей игрока.
//     *
//     * @param region  регион игрока (например, "eu")
//     * @param puuid   уникальный идентификатор игрока
//     * @param apiName имя API (по умолчанию "henrikdev")
//     * @return {@link Mono} с {@link ResponseEntity}, содержащим историю матчей
//     */
//    @GetMapping("/api/matches")
//    public Mono<ResponseEntity<MatchHistory>> getMatchHistory(
//            @RequestParam String region,
//            @RequestParam String puuid,
//            @RequestParam(defaultValue = "henrikdev") String apiName) {
//        log.info("Received request for match history: region={}, puuid={}, api={}", region, puuid, apiName);
//        return statsService.getMatchHistory(region, puuid, apiName)
//                .map(ResponseEntity::ok)
//                .defaultIfEmpty(ResponseEntity.notFound().build());
//    }
//
//    @GetMapping("/api/mmr")
//    public Mono<ResponseEntity<MMRDetails>> getMMRDetails(
//            @RequestParam String region,
//            @RequestParam String puuid,
//            @RequestParam(defaultValue = "henrikdev") String apiName) {
//        log.info("Received request for MMR details: region={}, puuid={}, api={}", region, puuid, apiName);
//        return statsService.getMMRDetails(region, puuid, apiName)
//                .map(ResponseEntity::ok)
//                .defaultIfEmpty(ResponseEntity.notFound().build());
//    }
//
//    /**
//     * GET /v3/leaderboard?region={region}&platform={platform}
//     */
//    @GetMapping("/v3/leaderboard")
//    public Mono<ResponseEntity<LeaderboardResponse>> getLeaderboard(
//            @RequestParam String region,
//            @RequestParam(defaultValue = "henrikdev") String apiName,
//            @RequestParam(defaultValue = "pc") String platform) {
//        log.info("Received request for leaderboard: region={}, api={}, platform={}", region, apiName, platform);
//        return statsService.getLeaderboard(region, apiName, platform)
//                .map(ResponseEntity::ok)
//                .defaultIfEmpty(ResponseEntity.notFound().build());
//    }
}
