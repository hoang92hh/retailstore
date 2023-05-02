package com.example.retailtstore.model;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class Greeting {
    private long id;
    private String content;


}
