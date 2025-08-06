package org.example.reactiveproject.webfluxreactive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class StudentController {

    StudentService studentService;

    @GetMapping("/student")
    public Mono<Student> getStudent(@RequestParam String name) {
        return studentService.getStudent(name);



    }


}
