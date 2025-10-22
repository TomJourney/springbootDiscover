package com.tom.springbootdiscover.cache;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomSpringBootCacheApplication.java
 * @Description TODO
 * @createTime 2025年08月02日 21:26:00
 */
@SpringBootApplication
public class TomSpringBootCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(TomSpringBootCacheApplication.class, args);

        HikariDataSource hikariDataSource;

        ServletWebServerApplicationContext servletWebServerApplicationContext;
    }
}
