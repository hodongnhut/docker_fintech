package com.fintech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fintech")
public class FintechController {

    @GetMapping
    public String getFintechInfo() {
        return "Welcome to the Fintech API!";
    }
}
