package com.tom.springnote.chapter03.listener;

import org.springframework.boot.BootstrapContextClosedEvent;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomApplicationListener.java
 * @Description TODO
 * @createTime 2024年11月21日 21:31:00
 */
public class TomBootstrapContextClosedEventListener implements ApplicationListener<BootstrapContextClosedEvent> {
    @Override
    public void onApplicationEvent(BootstrapContextClosedEvent event) {
        System.out.println("事件名=启动容器关闭，事件类=BootstrapContextClosedEvent");
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
