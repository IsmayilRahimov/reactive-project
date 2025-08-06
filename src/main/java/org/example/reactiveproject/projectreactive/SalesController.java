package org.example.reactiveproject.projectreactive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SalesController {

    SalesService salesService;

    @GetMapping("/sales")

    public Mono<Sales> getSales(@RequestParam String name) {
        return salesService.getSales(name);

    }
}
