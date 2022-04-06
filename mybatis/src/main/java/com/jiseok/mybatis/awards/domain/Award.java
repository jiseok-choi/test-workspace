package com.jiseok.mybatis.awards.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Award {

    private int id;
    private String name;
    private int year;

    @Builder
    public Award(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }
}
