package kz.lab.valorant_stats_backend.api.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * DTO для представления информации о киберспортивном матче.
 */
@Data
@Builder
public class EsportsMatchDto {
    /**
     * Идентификатор матча.
     */
    private String id;

    /**
     * Тип игры (например, "playAll").
     */
    private GameTypeDto gameType;

    /**
     * Список команд, участвующих в матче.
     */
    private List<TeamDto> teams;
}