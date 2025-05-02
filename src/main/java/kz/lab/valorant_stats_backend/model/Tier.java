package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Модель данных для уровня (tier) в пороговых значениях лидерборда.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tier {
    /**
     * Идентификатор уровня.
     */
    private int id;

    /**
     * Название уровня (например, "Immortal 1").
     */
    private String name;
}
