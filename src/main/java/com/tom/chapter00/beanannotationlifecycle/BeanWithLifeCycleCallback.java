package com.tom.chapter00.beanannotationlifecycle;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BeanWithLifeCycleCallback.java
 * @Description TODO
 * @createTime 2024年10月27日 21:49:00
 */
public class BeanWithLifeCycleCallback {
    public void init() {
        System.out.println("BeanWithLifeCycleCallback init()");
    }
    public void destory() {
        System.out.println("BeanWithLifeCycleCallback destory()");
    }

}
