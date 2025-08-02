package com.tom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName SpringbootRedisApplication.java
 * @Description TODO
 * @createTime 2024年12月01日 16:17:00
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.tom.springboot.tx.note.infrastructure.dao"})
public class SpringbootDiscoverRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDiscoverRedisApplication.class, args);
    }
}
