package com.tom.chapter00.composejavaandxml;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName ComposeJavaAndXmlRepository.java
 * @Description TODO
 * @createTime 2024年10月27日 20:52:00
 */
public class ComposeJavaAndXmlRepository {

    private String url;

    public void saveUser(String name) {
        System.out.println("ComposeJavaAndXmlRepository#saveUser(): name=" + name + ", url=" + url);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
