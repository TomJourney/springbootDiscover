package com.tom.springnote.chapter00.beanannotationlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BeanAnnotationLifeCycleConfig.java
 * @Description TODO
 * @createTime 2024年10月27日 21:48:00
 */
@Configuration
public class BeanAnnotationLifeCycleConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public BeanWithLifeCycleCallback beanWithInitMethod() {
        return new BeanWithLifeCycleCallback();
    }
}
