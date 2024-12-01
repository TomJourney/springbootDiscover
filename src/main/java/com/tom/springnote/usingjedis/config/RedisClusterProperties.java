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

@ConfigurationProperties(prefix = "spring.redis.cluster")
@Component
@PropertySource("classpath:/redis.cluster.properties")
public class RedisClusterProperties {
    private Integer expireSeconds;
    private String nodes;
    private int commandTimeout;

    public Integer getExpireSeconds() {
        return expireSeconds;
    }

    public void setExpireSeconds(Integer expireSeconds) {
        this.expireSeconds = expireSeconds;
    }

    public String getNodes() {
        return nodes;
    }

    public void setNodes(String nodes) {
        this.nodes = nodes;
    }

    public int getCommandTimeout() {
        return commandTimeout;
    }

    public void setCommandTimeout(int commandTimeout) {
        this.commandTimeout = commandTimeout;
    }
}
