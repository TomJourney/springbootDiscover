package com.tom.chapter00.propertysource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName PropertySourceMain.java
 * @Description TODO
 * @createTime 2024年10月29日 06:18:00
 */
@Configuration
@PropertySource(value = {"classpath:chapter00/kafka.properties", "classpath:chapter00/redis.properties"})
public class PropertySourceConfig {

    @Bean
    public TomCluster tomCluster() {
        return new TomCluster();
    }
}
