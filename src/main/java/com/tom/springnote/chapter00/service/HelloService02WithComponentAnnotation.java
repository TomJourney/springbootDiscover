package com.tom.springnote.chapter00.service;

import org.springframework.stereotype.Component;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName HelloService.java
 * @Description TODO
 * @createTime 2024年10月23日 06:36:00
 */
@Component
public class HelloService02WithComponentAnnotation {

    public void sayHello(String user) {
        System.out.println("HelloService02WithComponentAnnotation#sayHello: 02 hello " + user);
    }
}