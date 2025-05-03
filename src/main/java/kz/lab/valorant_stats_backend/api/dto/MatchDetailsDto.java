package kz.lab.valorant_stats_backend.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatchDetailsDto {
    /**
     * Информация о турнире (если матч в режиме Premier).
     */
    private TournamentInfoDto tournament;

    /**
     * Список команд, участвующих в матче.
     */
    private List<TeamInfoDto> teams;

    /**
     * Информация о матче.
     */
    private MatchInfoDto match;

    /**
     * Результат матча (название победившей команды или "Draw").
     */
    private String result;
}
