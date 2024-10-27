package com.tom.chapter00.config.importannotation.injectdependency.userrepository;

import com.tom.chapter00.config.importannotation.injectdependency.UserRepository;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName IUserRepository.java
 * @Description TODO
 * @createTime 2024年10月27日 20:14:00
 */
public interface IUserRepositoryConfig {

    public UserRepository userRepository();
}
