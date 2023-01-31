package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {
    
    @GetMapping("/")
    public String first_api(){
        return "Welcome to the app.";
    }
}
