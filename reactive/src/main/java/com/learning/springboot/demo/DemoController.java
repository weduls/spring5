package com.learning.springboot.demo;

import com.learning.springboot.demo.dto.Image;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-08-12
 **/
@RestController
@Slf4j
public class DemoController {

    @GetMapping("/images")
    public Mono<Void> images() {
        // 여러 객체를 list<Image>처럼 받지 않을 수 있다.
        return Flux.just(
                new Image("1", "learnin-string"),
                new Image("2", "soul booster")
        ).map(image -> {
            log.info("we will save " + image + " to a Reactive database soon!");
            return image;
        }).then();
    }

}
