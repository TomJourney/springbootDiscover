package com.tom.springbootdiscover.cache.springboot;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomApplicationStartedEventListener.java
 * @Description TODO
 * @createTime 2025年08月02日 21:45:00
 */
// 监听 ApplicationStartedEvent
public class TomApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("事件名=容器启动完成， 事件类型=ApplicationStartedEvent");
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
