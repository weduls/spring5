package com.wedul.springbootstudy;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-07-31
 **/
@Data
@Document
public class Chapter {

    @Id
    private String id;

    private String name;

    public Chapter(String id) {
        this.id = id;
    }

}
