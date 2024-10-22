package com.tom.chapter00;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName AppConfig00.java
 * @Description TODO
 * @createTime 2024年10月23日 06:35:00
 */
@Configuration
public class AppConfig00 {
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
