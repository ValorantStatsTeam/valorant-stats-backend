package kz.lab.valorant_stats_backend.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Список игроков в матче.
 */
@Data
public class Players {
    @JsonProperty("all_players")
    List<Player> allPlayers;
}
