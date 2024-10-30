package com.tom.springnote.chapter00.classwithjsr330;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName Jsr330Service.java
 * @Description TODO
 * @createTime 2024年10月27日 16:14:00
 */

@Component
public class Jsr330Service {

    // @Autowired是spring注解 ，这里不能使用 @Qualifier (JSR-330注解)
    @Autowired
    private Jsr330Depository jsr330Depository;

    public void saveUser(String userName) {
        jsr330Depository.saveUser(userName);
    }
}
