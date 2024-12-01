package com.tom.springnote.starterdataredis.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName SpringbootRedisSupportImpl.java
 * @Description TODO
 * @createTime 2024年12月01日 16:16:00
 */
@Component
public class SpringbootRedisRepository {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public String set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
        return key;
    }

    public String setExpire(String key, String value, int timeoutOfSecond) {
        redisTemplate.opsForValue().set(key, value);
        redisTemplate.expire(key, timeoutOfSecond, TimeUnit.SECONDS);
        return key;
    }


    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 获取链接工厂
     */
    public RedisConnectionFactory getConnectionFactory() {
        return this.redisTemplate.getConnectionFactory();
    }

    /**
     * 获取 RedisTemplate对象
     */
    public RedisTemplate<String, Object> getRedisTemplate() {
        return redisTemplate;
    }
}
