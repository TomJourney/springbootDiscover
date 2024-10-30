package com.tom.springnote.chapter00.beanannotation;

import com.tom.springnote.chapter00.config.importannotation.injectdependency.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BeanAnnotationMain.java
 * @Description TODO
 * @createTime 2024年10月27日 21:24:00
 */
public class BeanAnnotationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(BeanAnnotationConfig.class);
        System.out.println(container.getBean(UserService.class));
        System.out.println(container.getBean("userService"));
    }
}
