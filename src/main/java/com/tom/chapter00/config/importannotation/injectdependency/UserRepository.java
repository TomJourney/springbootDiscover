package com.tom.chapter00.config.importannotation.injectdependency;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName UserRepository.java
 * @Description TODO
 * @createTime 2024年10月27日 19:50:00
 */
public class UserRepository {

    public void saveUser(String name) {
        System.out.println("UserRepository#saveUser()： 保存用户成功， name=" + name);
    }
}
