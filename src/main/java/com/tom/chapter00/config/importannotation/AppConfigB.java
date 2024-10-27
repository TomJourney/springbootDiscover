package com.tom.chapter00.config.importannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName AppConfigA.java
 * @Description TODO
 * @createTime 2024年10月27日 19:31:00
 */
@Configuration
@Import(AppConfigA.class)
public class AppConfigB {

    @Bean
    public DiyB diyB() {
        return new DiyB();
    }
}
