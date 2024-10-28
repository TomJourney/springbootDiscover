package com.tom.chapter00.importresource;

import com.tom.chapter00.composejavaandxml.ComposeJavaAndXmlRepository;
import com.tom.chapter00.composejavaandxml.ComposeJavaAndXmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName ComposeJavaAndXmlConfig.java
 * @Description TODO
 * @createTime 2024年10月27日 20:52:00
 */
public class ImportResourceComposeJavaAndXmlMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(UserRepositoryConfigUsingImportResource.class);
        container.getBean(ComposeJavaAndXmlRepository.class).saveUser("Trump");
    }
}
