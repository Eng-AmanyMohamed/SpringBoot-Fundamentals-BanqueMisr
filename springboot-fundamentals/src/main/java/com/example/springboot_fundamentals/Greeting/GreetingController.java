package com.example.springboot_fundamentals.Greeting;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/hello")
            public String hello()
    {
        return "Hello, Spring Boot!";
    }

}
