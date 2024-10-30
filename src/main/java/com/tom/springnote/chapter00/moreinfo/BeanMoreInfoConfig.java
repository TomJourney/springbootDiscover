package com.tom.springnote.chapter00.moreinfo;

import com.tom.springnote.chapter00.config.importannotation.injectdependency.UserRepository;
import com.tom.springnote.chapter00.config.importannotation.injectdependency.UserService;
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
public class BeanMoreInfoConfig {

    @Bean
    public UserService userService1() {
        return new UserService(userRepository());
    }

    @Bean
    public UserService userService2() {
        return new UserService(userRepository());
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
}
