package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Метаданные матча.
 */
@Data
public class Metadata {
    @JsonProperty("map")
    String map;

    @JsonProperty("game_version")
    String gameVersion;

    @JsonProperty("game_length")
    long gameLength;

    @JsonProperty("game_start")
    long gameStart;

    @JsonProperty("matchid")
    String matchId;
}
