package kz.lab.valorant_stats_backend.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatchInfoDto {
    /**
     * Идентификатор матча.
     */
    private String matchId;

    /**
     * Название карты.
     */
    private String mapName;

    /**
     * Режим игры (например, Competitive).
     */
    private String queueName;

    /**
     * Продолжительность матча в миллисекундах.
     */
    private long gameLengthInMs;

    /**
     * Дата и время начала матча.
     */
    private Date startedAt;
}
