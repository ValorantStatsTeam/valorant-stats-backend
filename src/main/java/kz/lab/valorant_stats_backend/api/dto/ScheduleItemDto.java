package kz.lab.valorant_stats_backend.api.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * DTO для представления отдельного элемента расписания киберспортивного события.
 */
@Data
@Builder
public class ScheduleItemDto {
    /**
     * Дата и время события.
     */
    private Date date;

    /**
     * Состояние события (например, "completed").
     */
    private String state;

    /**
     * Тип события (например, "match").
     */
    private String type;

    /**
     * Ссылка на VOD (видео по запросу).
     */
    private String vod;

    /**
     * Информация о лиге.
     */
    private LeagueDto league;

    /**
     * Информация о турнире.
     */
    private TournamentDto tournament;

    /**
     * Информация о матче.
     */
    private EsportsMatchDto match;
}
