package org.example.reactiveproject.asychronous;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@NoArgsConstructor


public class ReactiveUser {
    public int id;
    public String name;
    public String email;

    public ReactiveUser(int id, String name, String email) {

        this.id = id;
        this.name = name;
        this.email = email;
    }

}
