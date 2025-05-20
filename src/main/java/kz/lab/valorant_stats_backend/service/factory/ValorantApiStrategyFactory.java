package kz.lab.valorant_stats_backend.service.factory;

import kz.lab.valorant_stats_backend.service.strategy.PandaScoreApiStrategy;
import kz.lab.valorant_stats_backend.service.strategy.ValorantApiStrategy;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

/**
 * Фабрика для создания стратегий получения данных из Valorant API.
 */
@Component
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ValorantApiStrategyFactory {
    PandaScoreApiStrategy pandaScoreApiStrategy;

    /**
     * Возвращает стратегию по имени API.
     *
     * @param apiName имя API
     * @return реализация {@link ValorantApiStrategy}
     * @throws IllegalArgumentException если указанное API не поддерживается
     */
    public ValorantApiStrategy getStrategy(String apiName) {
        if ("pandaScore".equalsIgnoreCase(apiName)) {
            return pandaScoreApiStrategy;
        }
        throw new IllegalArgumentException("Unsupported API: " + apiName);
    }
}
