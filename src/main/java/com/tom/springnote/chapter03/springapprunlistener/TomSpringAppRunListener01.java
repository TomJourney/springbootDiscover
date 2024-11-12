package com.tom.springnote.chapter03.springapprunlistener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.time.Duration;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName SpringAppRunListener01.java
 * @Description TODO
 * @createTime 2024年11月05日 22:42:00
 */
public class TomSpringAppRunListener01 implements SpringApplicationRunListener {

    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("TomSpringAppRunListener01 starting");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        System.out.println("TomSpringAppRunListener01 environmentPrepared");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("TomSpringAppRunListener01 contextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("TomSpringAppRunListener01 contextLoaded");
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("TomSpringAppRunListener01 started");
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("TomSpringAppRunListener01 ready");
    }
}
