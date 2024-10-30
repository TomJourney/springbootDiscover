package com.tom.springnote.chapter00.beanannotation.beanname;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BeanNameConfig.java
 * @Description TODO
 * @createTime 2024年10月28日 22:26:00
 */
public class BeanNameConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(BeanNameConfig.class);
        System.out.println(container.getBean("repositoryA1"));
        System.out.println(container.getBean("userRepo"));
        System.out.println(container.getBean("userRepo1"));
        System.out.println(container.getBean("userRepo2"));
        System.out.println(container.getBean("userRepo3"));
    }
}
