package com.tom.springbootdiscover.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomSpringBootCacheApplication.java
 * @Description TODO
 * @createTime 2025年08月02日 21:26:00
 */
@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "com.tom.springbootdiscover.cache.infrastructure.mapper")
public class TomSpringBootCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(TomSpringBootCacheApplication.class, args);
    }
}
