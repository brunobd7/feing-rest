package com.bruno.feignrest.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PostDto {

    private Integer id;
    private  Integer userId;
    private String title;
    private String body;

}
