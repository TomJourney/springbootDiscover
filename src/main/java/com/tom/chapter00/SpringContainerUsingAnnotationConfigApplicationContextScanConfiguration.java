package com.tom.chapter00;

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
public class SpringContainerUsingAnnotationConfigApplicationContextScanConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        System.out.println("before scan()");
        context.scan("com.tom.chapter00");
        System.out.println("after scan()");
        System.out.println("before refresh()");
        context.refresh();
        System.out.println("after refresh()");
        context.getBean(HelloService02.class).sayHello("Musk");
    }
}
