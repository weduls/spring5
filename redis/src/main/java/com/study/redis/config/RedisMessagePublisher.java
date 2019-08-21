package com.study.redis.config;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

/**
 * spring-boot-study
 *
 * @author wedul
 * @since 2019-08-21
 **/
@Service
public class RedisMessagePublisher {

    private RedisTemplate<String, String> redisTemplate;
    private ChannelTopic topic;

    public RedisMessagePublisher() {
    }

    public RedisMessagePublisher(RedisTemplate<String, String> redisTemplate, final ChannelTopic topic) {
        this.redisTemplate = redisTemplate;
        this.topic = topic;
    }

}
