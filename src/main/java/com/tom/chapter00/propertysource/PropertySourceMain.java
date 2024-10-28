package com.tom.chapter00.propertysource;

import com.tom.chapter00.config.AppConfig00;
import com.tom.chapter00.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName PropertySourceMain.java
 * @Description TODO
 * @createTime 2024年10月29日 06:18:00
 */
public class PropertySourceMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PropertySourceConfig.class);
        // 获取bean
        TomCluster tomCluster = context.getBean(TomCluster.class);
        System.out.println(tomCluster);
        System.out.println(tomCluster.getKafkaClusterUrl());
        // 通过Environment获取属性
        ConfigurableEnvironment env = context.getEnvironment();
        System.out.println(env.getProperty("kafka.cluster.name"));
        System.out.println(env.getProperty("kafka.cluster.url"));
        System.out.println(env.getProperty("redis.cluster.name"));
        System.out.println(env.getProperty("redis.cluster.url"));
    }
}
