package org.example.reactiveproject;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoUser {
    Mono<String> reactiveUser = Mono.just("Anar") ;
    Mono<String> reactiveUser1 = Mono.just("Aqil") ;

    Flux<String> reactiveUserFlux = Flux.just("Anar", "Aqil");





}
