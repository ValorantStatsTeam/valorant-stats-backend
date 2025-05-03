package kz.lab.valorant_stats_backend.api.dto;

import lombok.Builder;
import lombok.Data;

/**
 * DTO для представления информации о турнире.
 */
@Data
@Builder
public class TournamentDto {
    /**
     * Название турнира.
     */
    private String name;

    /**
     * Сезон турнира.
     */
    private String season;
}
