package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeaderboardData {
    @JsonProperty("updated_at")
    private Instant updatedAt;

    private List<Threshold> thresholds;
    private List<LeaderboardPlayerDetailed> players;
}