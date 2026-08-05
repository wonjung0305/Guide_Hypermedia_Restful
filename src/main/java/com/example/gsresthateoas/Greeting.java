package com.example.gsresthateoas;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.RepresentationModel;

// 이건 DTO, 클라이언트와 데이터를 주고받기 위해 만든 객체
public class Greeting extends RepresentationModel<Greeting> {

    private final String content;

    @JsonCreator
    public Greeting(@JsonProperty("content")String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
