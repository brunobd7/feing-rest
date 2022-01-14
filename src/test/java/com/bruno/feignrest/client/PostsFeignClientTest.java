package com.bruno.feignrest.client;

import com.bruno.feignrest.dto.PostDto;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.mock.HttpMethod;
import feign.mock.MockClient;
import org.junit.jupiter.api.Test;
import org.springframework.cloud.openfeign.support.SpringMvcContract;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostsFeignClientTest {

    private static String URL = "https://jsonplaceholder.typicode.com";
    private static String RESPONSE_CLIENT = "{\n" +
            "    \"userId\": 1,\n" +
            "    \"id\": 1,\n" +
            "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
            "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
            "  }";

    private PostsFeignClient postsFeignClient;

    @Test
    public void whenGetPostsClienteThenReturnOk() {

        this.builderFeingClient(new MockClient().ok(
                HttpMethod.GET,
                URL.concat("/posts"),
                RESPONSE_CLIENT
        ));

        List<PostDto> postDtoList = postsFeignClient.getAllPosts();

        assertFalse(postDtoList.isEmpty());


    }

    private void builderFeingClient(MockClient mockClient){

        postsFeignClient = Feign.builder()
                .client(mockClient)
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .contract(new SpringMvcContract())
                .target(PostsFeignClient.class,URL);

    }
}