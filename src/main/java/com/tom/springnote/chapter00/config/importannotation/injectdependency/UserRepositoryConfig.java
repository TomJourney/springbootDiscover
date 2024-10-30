package com.tom.springnote.chapter00.config.importannotation.injectdependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName UserRepositoryConfig.java
 * @Description TODO
 * @createTime 2024年10月27日 19:50:00
 */
@Configuration
public class UserRepositoryConfig {

    public @Bean UserRepository userRepository() {
        return new UserRepository(); 
    }
}
