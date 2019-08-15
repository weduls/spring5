package com.study.webflex;

import com.study.webflex.handler.PostHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-08-15
 **/
@ComponentScan
@EnableWebFlux
@Configuration
public class WebFluxConfig {

  @Bean
  public RouterFunction<?> routes(PostHandler postHandler) {
    return RouterFunctions.route(GET("/route").and(accept(APPLICATION_JSON)), postHandler::all)
      .andRoute(GET("/route/{id}").and(accept(APPLICATION_JSON)), postHandler::get)
      .andRoute(GET("/route/create").and(accept(APPLICATION_JSON)), postHandler::create);
  }

}
