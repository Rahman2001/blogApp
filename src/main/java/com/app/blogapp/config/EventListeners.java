package com.app.blogapp.config;

import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EventListeners {
    private final Flyway flyway;

    public EventListeners(@Qualifier("flyway")Flyway flyway) {
        this.flyway = flyway;
    }

    @EventListener({ ContextRefreshedEvent.class })
    public void handleContextRefreshEvent(ContextRefreshedEvent event) {
         this.flyway.migrate();
        //Arrays.stream(event.getApplicationContext().getBeanDefinitionNames()).forEach(log::info);
    }
}
