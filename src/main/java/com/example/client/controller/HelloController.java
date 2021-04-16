package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private String message;

    public HelloController(@Value("${message}") String message) {
        super();
        this.message = message;
    }

    @GetMapping
    public String String() {
        return message;
    }

}
