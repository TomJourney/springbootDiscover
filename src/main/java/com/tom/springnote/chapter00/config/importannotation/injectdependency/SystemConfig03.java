package com.tom.springnote.chapter00.config.importannotation.injectdependency;

import com.tom.springnote.chapter00.config.importannotation.injectdependency.userrepository.UserRepositoryConfigImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName SystemConfig01.java
 * @Description TODO
 * @createTime 2024年10月27日 19:53:00
 */
@Configuration
@Import({UserServiceConfig3.class, UserRepositoryConfigImpl.class})
public class SystemConfig03 {
}
