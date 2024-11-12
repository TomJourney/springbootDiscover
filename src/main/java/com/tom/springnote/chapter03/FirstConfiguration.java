package com.tom.springnote.chapter03;

import com.tom.springnote.chapter03.model.FirstService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName FirstConfiguration.java
 * @Description TODO
 * @createTime 2024年11月04日 21:19:00
 */
@Configuration
public class FirstConfiguration {

    @Bean
    public FirstService firstService() {
        return new FirstService();
    }
}
