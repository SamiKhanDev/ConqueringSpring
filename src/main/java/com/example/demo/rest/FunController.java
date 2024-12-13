package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

    @GetMapping("/")
    public String health(){
        return "health";
    }

}
