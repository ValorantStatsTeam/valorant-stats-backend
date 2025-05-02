package kz.lab.valorant_stats_backend.service.factory;

import kz.lab.valorant_stats_backend.service.strategy.HenrikDevApiStrategy;
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
    HenrikDevApiStrategy henrikDevApiStrategy;

    /**
     * Возвращает стратегию по имени API.
     *
     * @param apiName имя API (например, "henrikdev")
     * @return реализация {@link ValorantApiStrategy}
     * @throws IllegalArgumentException если указанное API не поддерживается
     */
    public ValorantApiStrategy getStrategy(String apiName) {
        if ("henrikdev".equalsIgnoreCase(apiName)) {
            return henrikDevApiStrategy;
        }
        throw new IllegalArgumentException("Unsupported API: " + apiName);
    }
}
