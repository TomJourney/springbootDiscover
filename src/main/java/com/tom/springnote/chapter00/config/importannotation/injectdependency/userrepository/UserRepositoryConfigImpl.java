package com.tom.springnote.chapter00.config.importannotation.injectdependency.userrepository;

import com.tom.springnote.chapter00.config.importannotation.injectdependency.UserRepository;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName UserRepositoryImpl.java
 * @Description TODO
 * @createTime 2024年10月27日 20:15:00
 */
public class UserRepositoryConfigImpl implements IUserRepositoryConfig {

    @Override
    public UserRepository userRepository() {
        return new UserRepository();
    }
}
