package kz.lab.valorant_stats_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import kz.lab.valorant_stats_backend.util.StatusDeserializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeaderboardResponse {
    /**
     * Статус ответа API.
     * Может быть числом (например, `200` для успеха) или объектом `{ "code": 1, "message": "success" }`.
     */
    @JsonProperty("status")
    @JsonDeserialize(using = StatusDeserializer.class)
    private Status status;

    /**
     * Метаданные результатов запроса (например, общее количество, возвращенные записи).
     */
    // Добавлено: поле results для соответствия структуре ответа API
    private Results results;

    /**
     * Данные лидерборда, включая пороговые значения и список игроков.
     */
    private LeaderboardData data;
}