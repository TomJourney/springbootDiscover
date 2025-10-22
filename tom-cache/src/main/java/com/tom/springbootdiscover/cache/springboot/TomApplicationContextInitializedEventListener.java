package com.tom.springbootdiscover.cache.springboot;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomApplicationContextInitializedEventListener.java
 * @Description 监听 ApplicationContextInitializedEvent
 * @createTime 2025年08月02日 21:42:00
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
