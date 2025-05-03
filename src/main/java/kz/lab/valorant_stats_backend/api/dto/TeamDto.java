package kz.lab.valorant_stats_backend.api.dto;

import lombok.Builder;
import lombok.Data;

/**
 * DTO для представления информации о команде в киберспортивном матче.
 */
@Data
@Builder
public class TeamDto {
    /**
     * Название команды.
     */
    private String name;

    /**
     * Код команды.
     */
    private String code;

    /**
     * URL иконки команды.
     */
    private String icon;

    /**
     * Победа команды (true, если выиграла).
     */
    private boolean hasWon;

    /**
     * Количество выигранных игр.
     */
    private Long gameWins;

    /**
     * Рекорд команды (победы и поражения).
     */
    private RecordDto record;
}