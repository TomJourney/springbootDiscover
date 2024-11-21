package com.tom.springnote.chapter03.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomApplicationListener.java
 * @Description TODO
 * @createTime 2024年11月21日 21:31:00
 */
public class TomApplicationEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("事件名=环境初始化完成， 事件类型=ApplicationEnvironmentPreparedEvent");
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
