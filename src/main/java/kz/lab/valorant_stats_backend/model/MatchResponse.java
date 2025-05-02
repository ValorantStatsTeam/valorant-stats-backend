package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Модель ответа от HenrikDev Valorant API.
 */
@Data
public class MatchResponse {
    @JsonProperty("status")
    int status;

    @JsonProperty("data")
    List<MatchData> data;
}
