package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Модель данных аккаунта игрока из Valorant API.
 */
@Data
public class AccountDetails {
    @JsonProperty("puuid")
    private String puuid;

    @JsonProperty("affinity")
    private String affinity;

    @JsonProperty("account_level")
    private int accountLevel;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tag")
    private String tag;

    @JsonProperty("player_card")
    private PlayerCard playerCard;

    @JsonProperty("last_updated_time")
    private String lastUpdatedTime;

    @JsonProperty("last_updated_time_epoch")
    private long lastUpdatedTimeEpoch;
}
