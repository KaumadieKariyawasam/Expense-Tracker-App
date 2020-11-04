package com.example.vizu.abc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @GetMapping(value = "/")
    public String getIndex(){
        return "index";
    }
}
