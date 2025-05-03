package kz.lab.valorant_stats_backend.api.dto;

import lombok.Builder;
import lombok.Data;

/**
 * DTO для представления типа игры в матче.
 */
@Data
@Builder
public class GameTypeDto {
    /**
     * Тип игры (например, "playAll").
     */
    private String type;

    /**
     * Количество игр.
     */
    private Long count;
}