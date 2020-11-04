package com.example.vizu.abc.controller;

import com.example.vizu.abc.model.Post;
import com.example.vizu.abc.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {

    private PostService postService;

    @GetMapping(value = "/")
    public String getIndex(){
        return "index";
    }

    @GetMapping(value = "/post")
    public List<Post> getPost(){
        return  postService.getAllPost();
    }
    @PostMapping(value = "/publishpost")
    public void publishPost(@RequestBody Post post){
        postService.insert(post);
    }
}
