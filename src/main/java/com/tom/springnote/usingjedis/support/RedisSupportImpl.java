package com.tom.springnote.usingjedis.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCluster;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName RedisSupportImpl.java
 * @Description TODO
 * @createTime 2024年12月01日 14:32:00
 */

@Component
public class RedisSupportImpl implements IRedisSupport {

    @Autowired
    private JedisCluster jedisCluster;

    @Override
    public String set(String key, String value) {
        return jedisCluster.set(key, value);
    }

    @Override
    public String get(String key) {
        return jedisCluster.get(key);
    }
}
