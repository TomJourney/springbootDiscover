package com.tom.springnote.chapter00.beanannotation.beanname;

import com.tom.springnote.chapter00.beanannotation.repository.RepositoryA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BeanNameConfig.java
 * @Description TODO
 * @createTime 2024年10月28日 22:26:00
 */
@Configuration
public class BeanNameConfig {

    @Bean
    public RepositoryA repositoryA1() {
        return new RepositoryA();
    }

    @Bean("userRepo")
    public RepositoryA repositoryA2() {
        return new RepositoryA();
    }

    @Bean(name = {"userRepo1", "userRepo2", "userRepo3"})
    public RepositoryA repositoryAWithMultipleName() {
        return new RepositoryA();
    }
}
