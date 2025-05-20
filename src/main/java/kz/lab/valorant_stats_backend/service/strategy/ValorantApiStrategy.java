package kz.lab.valorant_stats_backend.service.strategy;

import com.fasterxml.jackson.databind.JsonNode;
import reactor.core.publisher.Mono;

import java.util.Map;

/**
 * Интерфейс для стратегий получения данных из API Valorant.
 * Определяет методы для асинхронного получения различных данных, таких как игроки, команды, матчи и расписание.
 */
public interface ValorantApiStrategy {

    /**
     * Асинхронно получает список игроков.
     *
     * @return {@link Mono} с данными игроков в формате JSON
     */
    Mono<JsonNode> fetchPlayers();

    /**
     * Асинхронно получает данные о команде по названию.
     *
     * @param teamName название команды для фильтрации (может быть null)
     * @return {@link Mono} с данными команды в формате JSON
     */
    Mono<JsonNode> fetchTeam(String teamName);

    /**
     * Асинхронно получает историю матчей игрока по имени и тегу.
     *
     * @param region   регион игрока (например, "eu")
     * @param platform платформа игрока (например, "pc")
     * @param name     имя игрока
     * @param tag      тег игрока
     * @return {@link Mono} с историей матчей в формате JSON
     */
    Mono<JsonNode> fetchMatchHistoryByNameTag(String region, String platform, String name, String tag);

    /**
     * Асинхронно получает расписание эспортс-мероприятий.
     *
     * @return {@link Mono} с данными расписания в формате JSON
     */
    Mono<JsonNode> fetchEsportsSchedule();

    /**
     * Асинхронно получает список матчей Valorant с возможностью фильтрации.
     *
     * @return {@link Mono} с данными матчей в формате JSON
     */
    Mono<JsonNode> fetchMatches(String matchId, String matchName, String beginAt);
}