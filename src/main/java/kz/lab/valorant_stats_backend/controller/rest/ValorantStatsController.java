package kz.lab.valorant_stats_backend.controller.rest;

import com.fasterxml.jackson.databind.JsonNode;
import kz.lab.valorant_stats_backend.service.ValorantStatsService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
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


    @GetMapping("/players")
    public Mono<ResponseEntity<JsonNode>> getPlayers(
            @RequestParam(defaultValue = "pandaScore") String apiName) {
        log.info("start players");
        return statsService.getPlayers(apiName)
                .map(ResponseEntity::ok);
    }


    @GetMapping("/teams")
    public Mono<ResponseEntity<JsonNode>> getTeams(
            @RequestParam(defaultValue = "pandaScore") String apiName,
            @RequestParam(name = "teamName", required = false) String teamName) {
        log.info("start teams");
        return statsService.getTeam(apiName, teamName)
                .map(ResponseEntity::ok);
    }

    /**
     * Асинхронно получает список матчей Valorant с фильтрацией.
     *
     * @param apiName     имя API (по умолчанию "pandascore")
     * @param matchName параметры запроса для фильтрации
     * @return {@link Mono} с данными матчей
     */
    @GetMapping("/matches")
    public Mono<ResponseEntity<JsonNode>> getMatches(@RequestParam(defaultValue = "pandaScore") String apiName,
                                                     @RequestParam(name = "matchId", required = false) String matchId,
                                                     @RequestParam(name = "matchName", required = false) String matchName,
                                                     @RequestParam(name = "beginAt", required = false) String beginAt) {
        log.info("Fetching matches with matchId: {}, matchName: {}, beginAt: {}", matchId, matchName, beginAt);
        return statsService.getMatches(apiName, matchId, matchName, beginAt)
                .map(ResponseEntity::ok);
    }
}
