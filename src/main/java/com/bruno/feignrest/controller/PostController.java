package com.bruno.feignrest.controller;

import com.bruno.feignrest.client.PostsFeignClient;
import com.bruno.feignrest.dto.PostDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-posts")
@AllArgsConstructor
public class PostController {


    private PostsFeignClient postsFeignClient;


    @GetMapping
    public List<PostDto> getAllPosts(){
        return postsFeignClient.getAllPosts();
    }



}
