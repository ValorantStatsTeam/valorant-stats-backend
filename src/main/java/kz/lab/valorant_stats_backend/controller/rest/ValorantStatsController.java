package kz.lab.valorant_stats_backend.controller.rest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import kz.lab.valorant_stats_backend.service.ValorantStatsService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * REST контроллер для предоставления статистики Valorant.
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ValorantStatsController {
    ValorantStatsService statsService;





//    @GetMapping("/v1/esports/schedule")
//    public Mono<ResponseEntity<JsonNode>> getMatchHistoryByNameTag(@RequestParam(defaultValue = "henrikdev") String apiName) {
//        log.info("Received request for esports schedule: api={}", apiName);
//        return statsService.getEsportsSchedule(apiName)
//                .map(ResponseEntity::ok);
//    }


    @GetMapping("/players")
    public Mono<ResponseEntity<JsonNode>> getPlayers(
            @RequestParam(defaultValue = "henrikdev") String apiName) {
        log.info("start players");
        return statsService.getPlayers(apiName)
                .map(ResponseEntity::ok);
    }


    @GetMapping("/teams")
    public Mono<ResponseEntity<JsonNode>> getTeams(
            @RequestParam(defaultValue = "henrikdev") String apiName,
            @RequestParam(name = "teamName", required = false) String teamName) {
        log.info("start teams");
        return statsService.getTeam(apiName, teamName)
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
