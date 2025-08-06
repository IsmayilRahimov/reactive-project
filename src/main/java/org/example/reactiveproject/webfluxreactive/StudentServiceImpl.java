package org.example.reactiveproject.webfluxreactive;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl implements StudentService {
    private final WebClientStudent webClientStudent;

    public StudentServiceImpl(WebClientStudent webClientStudent) {
        this.webClientStudent = webClientStudent;
    }

    public Mono<Student> getStudent(String name) {
        return webClientStudent.webClientStudent().get()
                .uri(uriBuilder -> uriBuilder
                        .path("get/student")
                        .queryParam("studentAge", name)
                        .build()
                )
                .retrieve()
                .bodyToMono(Student.class);
    }


}
