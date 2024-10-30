package com.tom.springnote.chapter00.beanannotationlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BeanAnnotationLifeCycleMain.java
 * @Description TODO
 * @createTime 2024年10月27日 21:48:00
 */
public class BeanAnnotationLifeCycleMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(BeanAnnotationLifeCycleConfig.class);
        // 注册了关闭钩子，当容器销毁bean时才会调用 destory()方法
        container.registerShutdownHook();
    }
}
