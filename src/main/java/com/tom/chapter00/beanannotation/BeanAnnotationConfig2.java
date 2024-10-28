package com.tom.chapter00.beanannotation;

import com.tom.chapter00.beanannotation.repository.RepositoryA;
import com.tom.chapter00.beanannotation.service.ServiceA;
import com.tom.chapter00.config.importannotation.AppConfigA;
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
public class BeanAnnotationConfig2 {

    public @Bean RepositoryA repositoryA() {
        return new RepositoryA();
    }
    public @Bean ServiceA serviceA() {
        return new ServiceA(repositoryA()); // 调用方法即可注入依赖
    }
}
