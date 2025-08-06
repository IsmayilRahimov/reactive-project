package org.example.reactiveproject.projectreactive;

import reactor.core.publisher.Mono;

public interface SalesService {
    Mono<Sales> getSales(String name);

}
