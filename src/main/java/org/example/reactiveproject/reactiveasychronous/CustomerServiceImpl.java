package org.example.reactiveproject.reactiveasychronous;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerWebClient customerWebClient;

    public CustomerServiceImpl(CustomerWebClient customerWebClient) {
        this.customerWebClient = customerWebClient;
    }

    public Mono<Customer> getCustomer(int age) {
        return customerWebClient.customerWebClient().get()
                .uri(uriBuilder -> uriBuilder
                        .path("get/customer")
                        .queryParam("customerAge",age)
                        .build()
                )

                .retrieve()
                .bodyToMono(Customer.class);
    }

}
