package com.example.middleware1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class LegacyController {

    @GetMapping("/legacy")
    public String getLegacyMessage() {
        return "This is just old code";
    }
}
