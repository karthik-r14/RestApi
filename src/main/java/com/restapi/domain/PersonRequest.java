package com.restapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonRequest {
    @JsonProperty
    private int age;
    @JsonProperty
    private String name;

    public PersonRequest() {
    }

    public PersonRequest(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
