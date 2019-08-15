package com.study.webflex.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-08-14
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
    private int id;
    private String title;
    private String content;
}
