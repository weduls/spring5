package com.study.webflex.dao;

import com.study.webflex.dto.Post;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-08-14
 **/
@Repository
public class PostRepository {

  private static final Map<Integer, Post> DATA = new HashMap<>();
  private static int ID_COUNTER = 0;

  static {
    // initial data
    Arrays.asList("First Post", "Second Post", "Third Post")
      .stream()
      .forEach(title -> {
          int id = ID_COUNTER++;
          DATA.put(id, Post.builder().id(id).title(title).content("content of " + title).build());
        }
      );
  }

  public Flux<Post> findAll() {
    return Flux.fromIterable(DATA.values());
  }

  public Mono<Post> findById(int id) {
    return Mono.just(DATA.get(id));
  }

  public Mono<Post> createPost(Post post) {
    int id = ID_COUNTER++;
    post.setId(id);
    DATA.put(id, post);
    return Mono.just(post);
  }

}
