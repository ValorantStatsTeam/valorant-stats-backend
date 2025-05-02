package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeaderboardPlayerDetailed {
    private String card;
    private String title;
    @JsonProperty("is_banned")
    private boolean isBanned;
    @JsonProperty("is_anonymized")
    private boolean isAnonymized;
    private String puuid;
    private String name;
    private String tag;
    @JsonProperty("leaderboard_rank")
    private int leaderboardRank;
    private int tier;
    private int rr;
    private int wins;
    @JsonProperty("updated_at")
    private Instant updatedAt;
}
