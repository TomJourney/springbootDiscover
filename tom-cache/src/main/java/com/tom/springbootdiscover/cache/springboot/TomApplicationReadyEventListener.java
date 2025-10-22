package com.tom.springbootdiscover.cache.springboot;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomApplicationReadyEventListener.java
 * @Description TODO
 * @createTime 2025年08月02日 21:44:00
 */
// 监听 ApplicationReadyEvent
public class TomApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("事件名=容器就绪， 事件类型=ApplicationReadyEvent");
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
