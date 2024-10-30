package com.tom.springnote.chapter00;

import com.tom.springnote.chapter00.classwithjsr330.Jsr330Depository;
import com.tom.springnote.chapter00.classwithjsr330.Jsr330Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BasedJavaContainerMain.java
 * @Description TODO
 * @createTime 2024年10月23日 06:37:00
 */
public class JavaBasedContainerUsingJsr330Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Jsr330Service.class, Jsr330Depository.class);
        context.getBean(Jsr330Service.class).saveUser("zhangsan");
    }
}
