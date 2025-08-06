package org.example.reactiveproject.projectreactive;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SalesServiceImpl implements SalesService {

    private final WebClientSales webClientSales;

    public SalesServiceImpl(WebClientSales webClientSales) {
        this.webClientSales = webClientSales;
    }

    public Mono<Sales> getSales(String name) {
        return webClientSales.webClientSales().get()
                .uri(uriBuilder -> uriBuilder
                        .path("get/sales")
                        .queryParam("name", name)
                        .build()
                )
                .retrieve()
                .bodyToMono(Sales.class);

    }


}
