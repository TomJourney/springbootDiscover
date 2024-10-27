package com.tom.chapter00;

import com.tom.chapter00.service.HelloService;
import com.tom.chapter00.service.HelloService02;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BasedJavaContainerMain.java
 * @Description TODO
 * @createTime 2024年10月23日 06:37:00
 */
public class SpringContainerUsingAnnotationConfigApplicationContextNoArgConstructor {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig00.class, AppConfig02.class);
        context.refresh();
        context.getBean(HelloService.class).sayHello("Musk");
        context.getBean(HelloService02.class).sayHello("Trump");
    }
}
