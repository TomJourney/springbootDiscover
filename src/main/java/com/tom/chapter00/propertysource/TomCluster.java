package com.tom.chapter00.propertysource;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomCluster.java
 * @Description TODO
 * @createTime 2024年10月29日 06:22:00
 */
public class TomCluster {

    @Value("${kafka.cluster.url}")
    private String kafkaClusterUrl;
    @Value("${kafka.cluster.name}")
    private String kafkaClusterName;
    @Value("${redis.cluster.url}")
    private String redisClusterUrl;
    @Value("${redis.cluster.name}")
    private String redisClusterName;

    public String getKafkaClusterUrl() {
        return kafkaClusterUrl;
    }

    public String getKafkaClusterName() {
        return kafkaClusterName;
    }

    public String getRedisClusterUrl() {
        return redisClusterUrl;
    }

    public String getRedisClusterName() {
        return redisClusterName;
    }

    @Override
    public String toString() {
        return "TomCluster{" +
                "kafkaClusterUrl='" + kafkaClusterUrl + '\'' +
                ", kafkaClusterName='" + kafkaClusterName + '\'' +
                ", redisClusterUrl='" + redisClusterUrl + '\'' +
                ", redisClusterName='" + redisClusterName + '\'' +
                '}';
    }
}
