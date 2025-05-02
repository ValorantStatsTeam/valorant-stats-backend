package kz.lab.valorant_stats_backend.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Данные матча из ответа API.
 */
@Data
public class MatchData {
    @JsonProperty("metadata")
    Metadata metadata;

    @JsonProperty("players")
    Players players;
}
