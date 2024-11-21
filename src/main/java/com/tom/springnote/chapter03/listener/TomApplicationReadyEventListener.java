package com.tom.springnote.chapter03.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomApplicationListener.java
 * @Description TODO
 * @createTime 2024年11月21日 21:31:00
 */
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
