package kz.lab.valorant_stats_backend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Конфигурация приложения для настройки зависимостей.
 */
@Configuration
public class AppConfig {
    @Value("${henrikdev.api.url}")
    private String apiUrl;

    /**
     * Создает бин WebClient для выполнения асинхронных HTTP-запросов.
     *
     * @return настроенный экземпляр WebClient
     */
    @Bean
    public WebClient webClient() {
        ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(configurer ->
                        configurer.defaultCodecs()
                                .maxInMemorySize(16 * 1024 * 1024) // 16 МБ
                )
                .build();

        return WebClient.builder()
                .baseUrl(apiUrl)
                .exchangeStrategies(strategies)
                .build();
    }
}