package com.tom.springnote.chapter03.listener;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomApplicationListener.java
 * @Description TODO
 * @createTime 2024年11月21日 21:31:00
 */
public class TomApplicationContextInitializedEventListener implements ApplicationListener<ApplicationContextInitializedEvent> {
    @Override
    public void onApplicationEvent(ApplicationContextInitializedEvent event) {
        System.out.println("事件名=容器初始化完成，事件类型=ApplicationContextInitializedEvent");
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
