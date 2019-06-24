package com.zjl.redis_sub.config;

import org.springframework.stereotype.Component;


@Component
public interface RedisMsg {

    public void receiveMessage(String message);
}