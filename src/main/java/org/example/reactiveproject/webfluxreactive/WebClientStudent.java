package org.example.reactiveproject.webfluxreactive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientStudent {
    private final String studentBaseUrl = "http://localhost:8080";

    @Bean
    public WebClient webClientStudent() {
        return WebClient.builder()
                .baseUrl(studentBaseUrl)
                .build();
    }

}
