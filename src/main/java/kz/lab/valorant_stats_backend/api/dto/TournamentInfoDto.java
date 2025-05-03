package kz.lab.valorant_stats_backend.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO для информации о турнире.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TournamentInfoDto {
    /**
     * Идентификатор турнира.
     */
    private String tournamentId;

    /**
     * Название турнира.
     */
    private String name;

    /**
     * Идентификатор сезона.
     */
    private String seasonId;

    /**
     * Дивизион турнира.
     */
    private String division;
}
