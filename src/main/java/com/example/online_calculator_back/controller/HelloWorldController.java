package com.example.online_calculator_back.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @CrossOrigin(origins = "*")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World from Spring Boot!";
    }
}
