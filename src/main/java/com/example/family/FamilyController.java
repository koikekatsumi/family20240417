package com.example.family;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FamilyController {
    @GetMapping("/family")
    public List<Person> getPerson(){
        return List.of(
                new Person("john",24),
                new Person("june",21),
                new Person("jack",28)
        );
    };
}
