package org.example.reactiveproject.projectreactive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientSales {
    private final String salesBaseUrl = "http://localhost:8081";
    @Bean
    public WebClient webClientSales() {
        return WebClient.builder()
                .baseUrl(salesBaseUrl)
                .build();
    }
}
