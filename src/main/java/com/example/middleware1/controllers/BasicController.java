package com.example.middleware1.controllers;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class BasicController {

    @GetMapping("/time")
    public String getCurrentTime() {
        return LocalDateTime.now().toString();
    }
}
