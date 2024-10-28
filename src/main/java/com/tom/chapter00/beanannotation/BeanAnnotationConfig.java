package com.tom.chapter00.beanannotation;

import com.tom.chapter00.config.importannotation.injectdependency.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BeanAnnotationConfig.java
 * @Description TODO
 * @createTime 2024年10月27日 21:24:00
 */
@Configuration
public class BeanAnnotationConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
