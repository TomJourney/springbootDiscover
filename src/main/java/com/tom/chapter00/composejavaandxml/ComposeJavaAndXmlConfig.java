package com.tom.chapter00.composejavaandxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName ComposeJavaAndXmlConfig.java
 * @Description TODO
 * @createTime 2024年10月27日 20:52:00
 */
@Configuration
public class ComposeJavaAndXmlConfig {

    private @Autowired ComposeJavaAndXmlRepository composeJavaAndXmlRepository;
    public @Bean ComposeJavaAndXmlService composeJavaAndXmlService() {
        return new ComposeJavaAndXmlService(composeJavaAndXmlRepository);
    }
}
