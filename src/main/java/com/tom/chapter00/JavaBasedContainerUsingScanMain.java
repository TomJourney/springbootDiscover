package com.tom.chapter00;

import com.tom.chapter00.service.HelloService;
import com.tom.chapter00.service.HelloService02;
import com.tom.chapter00.service.HelloService02WithComponentAnnotation;
import com.tom.chapter00.service.HelloServiceWithComponentAnnotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BasedJavaContainerMain.java
 * @Description TODO
 * @createTime 2024年10月23日 06:37:00
 */
public class JavaBasedContainerUsingScanMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.tom.chapter00.service");
        context.refresh();
        context.getBean(HelloServiceWithComponentAnnotation.class).sayHello("Musk");
        context.getBean(HelloService02WithComponentAnnotation.class).sayHello("Trump");
    }
}
