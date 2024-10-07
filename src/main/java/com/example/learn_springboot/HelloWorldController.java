package com.example.learn_springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {

    @GetMapping("hello")
    public String helloWorld() {
        return "Hello Wolrd!";
    }

}
