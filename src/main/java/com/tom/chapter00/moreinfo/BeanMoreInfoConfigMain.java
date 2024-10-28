package com.tom.chapter00.moreinfo;

import com.tom.chapter00.config.importannotation.injectdependency.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BeanAnnotationMain.java
 * @Description TODO
 * @createTime 2024年10月27日 21:24:00
 */
public class BeanMoreInfoConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(BeanMoreInfoConfig.class);
        System.out.println(container.getBean("userService1", UserService.class).getUserRepository());
        System.out.println(container.getBean("userService2", UserService.class).getUserRepository());
    }
}
