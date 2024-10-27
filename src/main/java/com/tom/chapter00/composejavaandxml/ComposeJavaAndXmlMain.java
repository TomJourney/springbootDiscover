package com.tom.chapter00.composejavaandxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName ComposeJavaAndXmlMain.java
 * @Description TODO
 * @createTime 2024年10月27日 20:51:00
 */
public class ComposeJavaAndXmlMain {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("chapter00/beans00.xml");
        container.getBean(ComposeJavaAndXmlService.class).saveUser("Trump");
    }
}
