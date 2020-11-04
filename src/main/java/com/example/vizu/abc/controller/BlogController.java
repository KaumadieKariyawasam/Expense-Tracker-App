package com.example.vizu.abc.controller;

import com.example.vizu.abc.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    private PostService postService;

    @GetMapping(value = "/")
    public String getIndex(){
        return "index";
    }
}
