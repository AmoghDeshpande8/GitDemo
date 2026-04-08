package com.itp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo-api")
public class MessageController {

    @GetMapping("/msg")
    public String getMessage() {
        return "Hello from Main Conflift Try Nayan Branch";
    }
}