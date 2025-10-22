package com.tom.springbootdiscover.cache.springboot;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomApplicationPreparedEventListener.java
 * @Description TODO
 * @createTime 2025年08月02日 21:44:00
 */
// 监听ApplicationPreparedEvent
public class TomApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        System.out.println("事件名=应用初始化完成，事件类型=ApplicationPreparedEvent");
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
