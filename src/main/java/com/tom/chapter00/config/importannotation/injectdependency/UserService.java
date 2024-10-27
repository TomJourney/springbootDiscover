package com.tom.chapter00.config.importannotation.injectdependency;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2024年10月27日 19:49:00
 */
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(String name) {
        userRepository.saveUser(name);
    }
}
