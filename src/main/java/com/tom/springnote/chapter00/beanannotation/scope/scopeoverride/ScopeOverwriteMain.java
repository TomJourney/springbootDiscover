package com.tom.springnote.chapter00.beanannotation.scope.scopeoverride;

import com.tom.springnote.chapter00.beanannotation.repository.RepositoryA;
import com.tom.springnote.chapter00.beanannotation.repository.RepositoryB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName ScopeOverwriteMain.java
 * @Description TODO
 * @createTime 2024年10月28日 22:03:00
 */
public class ScopeOverwriteMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ScopeOverrideConfig.class);
        // 获取 RepositoryA实例，每次获取都会创建一个新实例，因为其scope为prototype
        System.out.println(container.getBean(RepositoryA.class));
        System.out.println(container.getBean(RepositoryA.class));

        // 获取 RepositoryB实例，每次获取都会创建一个新实例，因为其scope为singleton
        System.out.println(container.getBean(RepositoryB.class));
        System.out.println(container.getBean(RepositoryB.class));
    }
//    com.tom.chapter00.beanannotation.repository.RepositoryA@59474f18
//    com.tom.chapter00.beanannotation.repository.RepositoryA@65fb9ffc
//    com.tom.chapter00.beanannotation.repository.RepositoryB@3e694b3f
//    com.tom.chapter00.beanannotation.repository.RepositoryB@3e694b3f
}
