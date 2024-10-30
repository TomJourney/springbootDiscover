package com.tom.springnote.chapter00.config.importannotation.injectdependency;

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

    public UserService() {

    }

    public void saveUser(String name) {
        userRepository.saveUser(name);
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
}
