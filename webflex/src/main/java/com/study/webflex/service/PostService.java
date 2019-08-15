package com.study.webflex.service;

import com.study.webflex.dao.PostRepository;
import com.study.webflex.dto.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-08-15
 **/
@Service
@RequiredArgsConstructor
public class PostService {

  private final PostRepository postRepository;

  public Flux<Post> findAll() {
    return postRepository.findAll();
  }

  public Mono<Post> findById(int id) {
    return postRepository.findById(id);
  }

  public Mono<Post> createPost(Post post) {
    return postRepository.createPost(post);
  }

}
