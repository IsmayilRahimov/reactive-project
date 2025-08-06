package org.example.reactiveproject.reactiveasychronous;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
public class CustomerWebClient {

    private final String customerBaseUrl = "http://localhost:8080";

    @Bean
    public WebClient customerWebClient() {
        return WebClient.builder()
                .baseUrl(customerBaseUrl)
                .build();
    }


}
