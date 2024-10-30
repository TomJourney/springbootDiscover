package com.tom.springnote.chapter00.importresource;

import com.tom.springnote.chapter00.composejavaandxml.ComposeJavaAndXmlRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
