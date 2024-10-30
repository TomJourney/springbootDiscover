package com.tom.springnote.chapter00.classwithjsr330;

import org.springframework.stereotype.Component;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName Jsr330Depository.java
 * @Description TODO
 * @createTime 2024年10月27日 16:15:00
 */
@Component
public class Jsr330Depository {

    public void saveUser(String userName) {
        System.out.println("saveUser() name=" + userName + " 成功");
    }
}
