package kz.lab.valorant_stats_backend.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Модель данных одного матча.
 */
@Data
public class Match {
    @JsonProperty("metadata")
    private Metadata metadata;

    @JsonProperty("players")
    private Players players;
}
