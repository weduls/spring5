package com.study.webflex.controller;

import com.study.webflex.dto.Post;
import com.study.webflex.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-08-15
 **/
@RestController
@RequiredArgsConstructor
public class PostController {

  private final PostService postService;

  @GetMapping(value = "")
  public Flux<Post> all() {
    return postService.findAll();
  }

  @GetMapping(value = "/{id}")
  public Mono<Post> get(@PathVariable(value = "id") int id) {
    return postService.findById(id);
  }

  @PostMapping(value = "")
  public Mono<Post> create(Post post) {
    return postService.createPost(post);
  }

}
