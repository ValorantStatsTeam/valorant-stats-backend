package kz.lab.valorant_stats_backend.api.dto;


import lombok.Builder;
import lombok.Data;

/**
 * DTO для представления информации о лиге.
 */
@Data
@Builder
public class LeagueDto {
    /**
     * Название лиги.
     */
    private String name;

    /**
     * Идентификатор лиги.
     */
    private String identifier;

    /**
     * URL иконки лиги.
     */
    private String icon;

    /**
     * Регион лиги.
     */
    private String region;
}
