package com.app.blogapp.config;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.FluentConfiguration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
@EnableConfigurationProperties(FlywayProperty.class)
public class FlywayConfig {

    private final FlywayEntity flywayEntity;

    public FlywayConfig(FlywayProperty flywayProperty) {
        this.flywayEntity = new FlywayEntity.FlywayEntityBuilder()
                .url(flywayProperty.getUrl())
                .user(flywayProperty.getUser())
                .password(flywayProperty.getPassword())
                .location(flywayProperty.getLocation())
                .build();
    }

    @Bean
    public FluentConfiguration flywayConfigBuilder() {
        return Flyway.configure()
                .dataSource(this.flywayEntity.getUrl(), this.flywayEntity.getUser(), this.flywayEntity.getPassword())
                .locations(this.flywayEntity.getLocation())
                .outOfOrder(false)
                .baselineOnMigrate(true);
    }

    @Bean("flyway")
    public Flyway getFlyway(@Qualifier("flywayConfigBuilder") FluentConfiguration fluentConfiguration) {
        return fluentConfiguration.load();
    }
}
