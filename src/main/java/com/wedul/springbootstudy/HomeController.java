package com.wedul.springbootstudy;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-07-31
 **/
@RestController
public class HomeController {

    @GetMapping
    public String greeting(String name) {
        return new StringBuilder("Hey ").append(StringUtils.isBlank(name) ? " wedul!" : name).toString();
    }

}
