package com.zjl.redis_pub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 发布
 * @author: jialei.zhu
 * @create: 2019-06-24 14:55
 **/
@RestController
public class PubController {

    @Autowired
    StringRedisTemplate redisTemplate;

    // http://127.0.0.1:8010/pub?channel=channel1&msg=testmsg
    @GetMapping(value = "/pub")
    public void pubMessage(@RequestParam(value = "channel") String channel,
                           @RequestParam(value = "msg",defaultValue = "this is a msg from pub.") String msg){
        redisTemplate.convertAndSend(channel, msg);
    }


}
