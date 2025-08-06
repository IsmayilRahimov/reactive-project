package org.example.reactiveproject.webfluxreactive;

import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Mono;

public interface StudentService {
    Mono<Student> getStudent( String name);
}
