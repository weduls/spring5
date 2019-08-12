package com.wedul.springbootstudy;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-07-31
 **/
@Repository
public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {
}
