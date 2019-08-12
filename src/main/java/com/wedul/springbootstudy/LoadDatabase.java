package com.wedul.springbootstudy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-08-11
 **/
@Configuration
public class LoadDatabase {

    /**
     * Command Line Runner 클래스이다.
     * @param repository
     * @return
     */
    @Bean
    CommandLineRunner init(ChapterRepository repository) {
        return args -> {
            Flux.just(
                    new Chapter("Quick Start with Java"),
                    new Chapter("Reactive Web with Spring Boot"),
                    new Chapter("...and more!"))
                    .flatMap(repository::save)
                    .subscribe(System.out::println);
        };
    }

}
