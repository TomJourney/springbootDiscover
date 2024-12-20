package com.tom.springnote.starterdataredis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName SpringbootRedisConfig.java
 * @Description TODO
 * @createTime 2024年12月01日 16:14:00
 */
@Configuration
public class SpringbootRedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();

        /* 设置value的序列化规则和 key的序列化规则 */
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        GenericJackson2JsonRedisSerializer genericJackson2JsonRedisSerializer = new GenericJackson2JsonRedisSerializer();

        redisTemplate.setKeySerializer(stringRedisSerializer);                // key采用String的序列化方式
        redisTemplate.setHashKeySerializer(stringRedisSerializer);            // hash的key也采用String的序列化方式
        redisTemplate.setValueSerializer(genericJackson2JsonRedisSerializer); // value序列化方式采用jackson
        redisTemplate.setConnectionFactory(connectionFactory);                // 默认使用letttuce，如果想使用Jedis，创建JedisConnectionFactory实例作为参数传入

        return redisTemplate;
    }
}
