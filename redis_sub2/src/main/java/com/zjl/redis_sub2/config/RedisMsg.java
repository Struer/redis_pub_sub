package com.zjl.redis_sub2.config;

import org.springframework.stereotype.Component;


@Component
public interface RedisMsg {

    public void receiveMessage(String message);
}