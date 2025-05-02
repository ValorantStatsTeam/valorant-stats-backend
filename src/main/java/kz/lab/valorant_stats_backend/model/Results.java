package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Модель данных для метаданных результатов запроса лидерборда.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
    /**
     * Общее количество записей в лидерборде.
     */
    private int total;

    /**
     * Количество возвращенных записей.
     */
    private int returned;

    /**
     * Количество записей до текущего набора.
     */
    private int before;

    /**
     * Количество записей после текущего набора.
     */
    private int after;
}
