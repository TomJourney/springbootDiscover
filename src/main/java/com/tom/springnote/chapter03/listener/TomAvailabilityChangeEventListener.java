package com.tom.springnote.chapter03.listener;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomApplicationListener.java
 * @Description TODO
 * @createTime 2024年11月21日 21:31:00
 */
public class TomAvailabilityChangeEventListener implements ApplicationListener<AvailabilityChangeEvent> {
    @Override
    public void onApplicationEvent(AvailabilityChangeEvent event) {
        System.out.println("事件名=可用性变更， 事件类型=AvailabilityChangeEvent， event.getState()=" + event.getState());
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
