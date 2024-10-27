package com.tom.chapter00.config.importannotation.injectdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName ServiceConfig.java
 * @Description TODO
 * @createTime 2024年10月27日 19:49:00
 */
@Configuration
public class UserServiceConfig2 {

    private @Autowired UserRepositoryConfig userRepositoryConfig;

    public @Bean UserService userService() {
        return new UserService(userRepositoryConfig.userRepository());
    }
}
