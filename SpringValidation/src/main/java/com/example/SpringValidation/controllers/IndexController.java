package com.example.SpringValidation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
    
    @GetMapping("/index")
    public String index() {
        return "Olá Mundo!";
    }
}
