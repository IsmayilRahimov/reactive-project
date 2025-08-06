package org.example.reactiveproject.reactiveasychronous;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class CustomerController {

    CustomerService customerService;
    @GetMapping("/customer")
    public Mono<Customer> getCustomer(@RequestParam int age) {
        return customerService.getCustomer(age);

    }

}
