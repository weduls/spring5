package com.study.webflex.handler;

import com.study.webflex.dto.Post;
import com.study.webflex.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-08-15
 **/
@Component
@RequiredArgsConstructor
public class PostHandler {

  private final PostService postService;

  public Mono<ServerResponse> all(ServerRequest serverRequest) {
    return ServerResponse.ok().body(postService.findAll(), Post.class);
  }

  public Mono<ServerResponse> get(ServerRequest serverRequest) {
    String id = serverRequest.path();
    return ServerResponse.ok().body(postService.findById(Integer.valueOf(id)), Post.class);
  }

  public Mono<ServerResponse> create(ServerRequest serverRequest) {
    return serverRequest.bodyToMono(Post.class).doOnNext(post -> postService.createPost(post)).then(ServerResponse.ok().build());
  }

}
