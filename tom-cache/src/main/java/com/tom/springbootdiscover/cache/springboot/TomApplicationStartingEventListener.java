package com.tom.springbootdiscover.cache.springboot;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomApplicationStartingEventListener.java
 * @Description TODO
 * @createTime 2025年08月02日 21:45:00
 */
// 监听 ApplicationStartingEvent
public class TomApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("事件名=应用开始启动，事件类型=ApplicationStartingEvent");
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
