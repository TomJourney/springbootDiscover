package com.tom.springbootdiscover.cache.springboot;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomAvailabilityChangeEventListener.java
 * @Description TODO
 * @createTime 2025年08月02日 21:46:00
 */
// 监听 AvailabilityChangeEvent
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
