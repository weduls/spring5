package com.learning.springboot.demo.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-08-12
 **/
@Data
@RequiredArgsConstructor
public class Image {

    private String id;

    private String name;

    public Image(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
