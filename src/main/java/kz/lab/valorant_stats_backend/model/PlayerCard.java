package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Модель данных карточки игрока.
 */
@Data
public class PlayerCard {
    @JsonProperty("small")
    private String small;

    @JsonProperty("large")
    private String large;

    @JsonProperty("wide")
    private String wide;

    @JsonProperty("id")
    private String id;
}
