package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Модель данных игрока из HenrikDev Valorant API.
 */
@Data
public class Player {
    @JsonProperty("puuid")
    String puuid;

    @JsonProperty("name")
    String name;

    @JsonProperty("tag")
    String tag;

    @JsonProperty("team")
    String team;

    @JsonProperty("level")
    int level;

    @JsonProperty("character")
    String character;

    @JsonProperty("currenttier_patched")
    String currentTier;
}
