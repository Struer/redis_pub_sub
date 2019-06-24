package com.zjl.redis_sub2.config;

public class RedisPmpSub implements RedisMsg{

    /**
     * 接收消息的方法
     * @param message 订阅消息
     */
    public void receiveMessage(String message){
        //注意通道调用的方法名要和RedisConfig2的listenerAdapter的MessageListenerAdapter参数2相同
        System.out.println(message);
    }
}