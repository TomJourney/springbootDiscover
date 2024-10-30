package com.tom.springnote.chapter00.config.importannotation.injectdependency;

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
@Import({UserServiceConfig.class, UserRepositoryConfig.class})
public class SystemConfig01 {
}
