package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Модель данных лидерборда из Valorant API.
 */
@Data
public class Leaderboard {
    @JsonProperty("players")
    private List<LeaderboardPlayer> players;
}
