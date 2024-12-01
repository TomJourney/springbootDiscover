package com.tom.springnote.usingjedis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName RedisPoolProperties.java
 * @Description TODO
 * @createTime 2024年12月01日 14:13:00
 */

@ConfigurationProperties(prefix = "spring.redis.pool")
@Component
@PropertySource("classpath:/redis.pool.properties")
public class RedisPoolProperties {
    private Integer maxActive;
    private Integer maxWait;
    private Integer maxIdle;
    private Integer minIdle;

    public Integer getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(Integer maxActive) {
        this.maxActive = maxActive;
    }

    public Integer getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(Integer maxWait) {
        this.maxWait = maxWait;
    }

    public Integer getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }

    public Integer getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(Integer minIdle) {
        this.minIdle = minIdle;
    }
}
