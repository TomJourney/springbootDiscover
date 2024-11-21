package com.tom.springnote.chapter03.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomApplicationListener.java
 * @Description TODO
 * @createTime 2024年11月21日 21:31:00
 */
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
