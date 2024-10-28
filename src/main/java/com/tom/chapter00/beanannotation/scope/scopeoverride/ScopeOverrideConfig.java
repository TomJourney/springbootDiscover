package com.tom.chapter00.beanannotation.scope.scopeoverride;

import com.tom.chapter00.beanannotation.repository.RepositoryA;
import com.tom.chapter00.beanannotation.repository.RepositoryB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName ScopeOverrideConfig.java
 * @Description TODO
 * @createTime 2024年10月28日 22:04:00
 */
@Configuration
public class ScopeOverrideConfig {

    @Bean
    @Scope("prototype")
    public RepositoryA repositoryA() {
        return new RepositoryA();
    }

    @Bean
    @Scope("singleton")
    public RepositoryB repositoryB() {
        return new RepositoryB();
    }
}
