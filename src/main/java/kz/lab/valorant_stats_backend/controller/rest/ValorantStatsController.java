package kz.lab.valorant_stats_backend.controller.rest;

import kz.lab.valorant_stats_backend.api.dto.EsportsScheduleDto;
import kz.lab.valorant_stats_backend.api.dto.MatchDetailsDto;
import kz.lab.valorant_stats_backend.model.generated.MatchHistorySchema;
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
    public Mono<ResponseEntity<MatchHistorySchema>> getMatchHistoryByNameTag(
            @RequestParam String region,
            @RequestParam String platform,
            @RequestParam String name,
            @RequestParam String tag,
            @RequestParam(defaultValue = "henrikdev") String apiName) {
        log.info("Received request for match history: region={}, platform={}, name={}, tag={}, api={}",
                region, platform, name, tag, apiName);
        return statsService.getMatchHistoryByNameTag(region, platform, name, tag, apiName)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    /**
     * Получает подробную информацию о матче игрока по имени и тегу.
     * <p>
     * Возвращает данные о турнире, командах, матче и результате.
     *
     * @param region   регион игрока (например, "eu")
     * @param platform платформа игрока (например, "pc")
     * @param name     имя игрока
     * @param tag      тег игрока
     * @param apiName  имя API (по умолчанию "henrikdev")
     * @return {@link Mono} с {@link ResponseEntity}, содержащим подробности матча
     */
    @GetMapping("/v4/match-details")
    public Mono<ResponseEntity<MatchDetailsDto>> getMatchDetails(
            @RequestParam String region,
            @RequestParam String platform,
            @RequestParam String name,
            @RequestParam String tag,
            @RequestParam(defaultValue = "henrikdev") String apiName) {
        log.info("Received request for match details: region={}, platform={}, name={}, tag={}, api={}",
                region, platform, name, tag, apiName);
        return statsService.getMatchDetails(region, platform, name, tag, apiName)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    // *** Добавлено: метод для получения расписания киберспортивных событий ***

    /**
     * Получает расписание киберспортивных событий.
     * <p>
     * Возвращает структурированные данные о событиях, лигах, турнирах и матчах.
     *
     * @param apiName имя API (по умолчанию "henrikdev")
     * @return {@link Mono} с {@link ResponseEntity}, содержащим расписание событий
     */
    @GetMapping("/v1/esports/schedule")
    public Mono<ResponseEntity<EsportsScheduleDto>> getEsportsSchedule(
            @RequestParam(defaultValue = "henrikdev") String apiName) {
        log.info("Received request for esports schedule: api={}", apiName);
        return statsService.getEsportsSchedule(apiName)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}