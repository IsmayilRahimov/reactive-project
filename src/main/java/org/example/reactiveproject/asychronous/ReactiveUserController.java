package org.example.reactiveproject.asychronous;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController




public class ReactiveUserController {

    ReactiveUserService reactiveUserService;

public ReactiveUserController(ReactiveUserService reactiveUserService) {
    this.reactiveUserService = reactiveUserService;
}
    @GetMapping("/users1")
    public Flux<List<ReactiveUser>> getUsersList() {

        return reactiveUserService.getUsersList();
    }

    @GetMapping("/user1")
    public Mono<ReactiveUser> getUser() {
        return reactiveUserService.getUser();

    }


}
