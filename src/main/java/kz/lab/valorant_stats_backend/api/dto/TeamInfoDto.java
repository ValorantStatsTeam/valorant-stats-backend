package kz.lab.valorant_stats_backend.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO для информации о команде.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeamInfoDto {
    /**
     * Идентификатор команды.
     */
    private String teamId;

    /**
     * Название состава Premier (если применимо).
     */
    private String rosterName;

    /**
     * Тег состава Premier.
     */
    private String rosterTag;

    /**
     * Список игроков (имя#тег).
     */
    private List<String> players;

    /**
     * Количество выигранных раундов.
     */
    private Long roundsWon;

    /**
     * Количество проигранных раундов.
     */
    private Long roundsLost;

    /**
     * Победа команды (true, если выиграла).
     */
    private Boolean won;
}
