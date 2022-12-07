package com.example;

import com.example.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public MessageService messageService() {
        return () -> "Monika Sokolowska";
    }
}