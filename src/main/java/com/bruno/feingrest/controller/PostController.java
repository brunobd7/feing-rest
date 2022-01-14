package com.bruno.feingrest.controller;

import com.bruno.feingrest.client.PostsFeingClient;
import com.bruno.feingrest.dto.PostDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-posts")
@AllArgsConstructor
public class PostController {


    private PostsFeingClient postsFeingClient;


    @GetMapping
    public List<PostDto> getAllPosts(){
        return postsFeingClient.getAllPosts();
    }



}
