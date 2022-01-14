package com.bruno.feingrest.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PostDto {

    private Integer id;
    private  Integer userId;
    private String tittle;
    private String body;

}
