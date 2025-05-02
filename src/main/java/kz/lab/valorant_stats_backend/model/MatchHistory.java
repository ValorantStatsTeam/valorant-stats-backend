package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Модель данных истории матчей игрока из Valorant API.
 */
@Data
public class MatchHistory {
    @JsonProperty("data")
    private List<Match> data;
}
