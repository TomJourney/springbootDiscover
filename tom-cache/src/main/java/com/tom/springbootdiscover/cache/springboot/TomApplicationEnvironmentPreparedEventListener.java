package com.tom.springbootdiscover.cache.springboot;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName TomApplicationEnvironmentPreparedEventListener.java
 * @Description TODO
 * @createTime 2025年08月02日 21:43:00
 */
// 监听 ApplicationEnvironmentPreparedEvent
public class TomApplicationEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("事件名=环境初始化完成， 事件类型=ApplicationEnvironmentPreparedEvent");
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
