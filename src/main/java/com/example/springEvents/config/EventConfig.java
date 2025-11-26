package com.example.springEvents.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.scheduling.annotation.Async;

@Configuration
public class EventConfig
{
    @Bean
    public ApplicationEventMulticaster applicationEventMulticaster()
    {
        SimpleApplicationEventMulticaster eventMulticasted = new SimpleApplicationEventMulticaster();
        eventMulticasted.setErrorHandler(error -> {
            System.out.println("Error handling order event: " + error);
        });
        return eventMulticasted;
    }
}
