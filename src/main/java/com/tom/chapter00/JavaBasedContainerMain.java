package com.tom.chapter00;

import com.tom.chapter00.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BasedJavaContainerMain.java
 * @Description TODO
 * @createTime 2024年10月23日 06:37:00
 */
public class JavaBasedContainerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig00.class);
        HelloService helloService = context.getBean(HelloService.class);
        helloService.sayHello("tom");
    }
}
