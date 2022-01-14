package com.bruno.feignrest.client;

import com.bruno.feignrest.dto.PostDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "post", url ="https://jsonplaceholder.typicode.com")
public interface PostsFeignClient {

    @GetMapping(value = "/posts")
    List<PostDto> getAllPosts();

}
