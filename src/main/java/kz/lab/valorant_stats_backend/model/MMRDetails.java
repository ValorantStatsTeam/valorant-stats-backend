package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MMRDetails {
    @JsonProperty("currenttier")
    private int currentTier;

    @JsonProperty("currenttier_patched")
    private String currentTierPatched;

    @JsonProperty("ranking_in_tier")
    private int rankingInTier;

    @JsonProperty("mmr_change_to_last_game")
    private int mmrChangeToLastGame;

    @JsonProperty("elo")
    private int elo;
}
