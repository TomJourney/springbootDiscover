package com.tom.chapter00.importresource;

import com.tom.chapter00.composejavaandxml.ComposeJavaAndXmlRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName UserRepositoryConfigUsingImportResource.java
 * @Description TODO
 * @createTime 2024年10月27日 21:11:00
 */
@Configuration
@ImportResource("classpath:/chapter00/beans01.xml")
public class UserRepositoryConfigUsingImportResource {
    private @Value("${jdbc.url}") String url;

    public @Bean ComposeJavaAndXmlRepository composeJavaAndXmlRepository() {
        ComposeJavaAndXmlRepository composeJavaAndXmlRepository = new ComposeJavaAndXmlRepository();
        composeJavaAndXmlRepository.setUrl(url);
        return composeJavaAndXmlRepository;
    }
}
