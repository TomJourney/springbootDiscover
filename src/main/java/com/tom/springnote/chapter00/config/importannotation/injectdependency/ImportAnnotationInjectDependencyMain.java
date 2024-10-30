package com.tom.springnote.chapter00.config.importannotation.injectdependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName ImportAnnotationMain.java
 * @Description TODO
 * @createTime 2024年10月27日 19:33:00
 */
public class ImportAnnotationInjectDependencyMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SystemConfig01.class);
        context.getBean(UserService.class).saveUser("Trump");
    }
}
