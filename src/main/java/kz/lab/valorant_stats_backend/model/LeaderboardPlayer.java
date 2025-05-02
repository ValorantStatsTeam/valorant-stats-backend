package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Модель данных игрока в лидерборде.
 */
@Data
class LeaderboardPlayer {
    @JsonProperty("puuid")
    private String puuid;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tag")
    private String tag;

    @JsonProperty("leaderboard_rank")
    private int leaderboardRank;

    @JsonProperty("ranked_rating")
    private int rankedRating;

    @JsonProperty("competitive_tier")
    private int competitiveTier;
}
