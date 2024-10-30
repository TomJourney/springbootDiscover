package com.tom.springnote.chapter00.config.importannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName ImportAnnotationMain.java
 * @Description TODO
 * @createTime 2024年10月27日 19:33:00
 */
public class ImportAnnotationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigB.class);
        context.getBean(DiyA.class).print();
    }
}
