package org.example.reactiveproject.reactiveasychronous;

import reactor.core.publisher.Mono;

public interface CustomerService {
    Mono<Customer> getCustomer(int age);
}
