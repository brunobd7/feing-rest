package com.bruno.feingrest.client;

import com.bruno.feingrest.dto.PostDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "post", url ="https://jsonplaceholder.typicode.com")
public interface PostsFeingClient {

    @GetMapping(value = "/posts")
    List<PostDto> getAllPosts();

}
