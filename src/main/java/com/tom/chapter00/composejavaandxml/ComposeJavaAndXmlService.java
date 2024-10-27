package com.tom.chapter00.composejavaandxml;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName ComposeJavaAndXmlRepository.java
 * @Description TODO
 * @createTime 2024年10月27日 20:52:00
 */
public class ComposeJavaAndXmlService {

    private ComposeJavaAndXmlRepository composeJavaAndXmlRepository;
    public ComposeJavaAndXmlService(ComposeJavaAndXmlRepository composeJavaAndXmlRepository) {
        this.composeJavaAndXmlRepository = composeJavaAndXmlRepository;
    }
    public void saveUser(String name) {
        composeJavaAndXmlRepository.saveUser(name);
    }
}
