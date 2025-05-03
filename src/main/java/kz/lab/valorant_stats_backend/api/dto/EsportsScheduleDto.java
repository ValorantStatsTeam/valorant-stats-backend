package kz.lab.valorant_stats_backend.api.dto;


import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * DTO для представления расписания киберспортивных событий.
 */
@Data
@Builder
public class EsportsScheduleDto {
    /**
     * Статус ответа API.
     */
    private Long status;

    /**
     * Список элементов расписания.
     */
    private List<ScheduleItemDto> scheduleItems;
}