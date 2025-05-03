package kz.lab.valorant_stats_backend.api.dto;


import lombok.Builder;
import lombok.Data;

/**
 * DTO для представления рекорда команды (победы и поражения).
 */
@Data
@Builder
public class RecordDto {
    /**
     * Количество побед.
     */
    private Long wins;

    /**
     * Количество поражений.
     */
    private Long losses;
}