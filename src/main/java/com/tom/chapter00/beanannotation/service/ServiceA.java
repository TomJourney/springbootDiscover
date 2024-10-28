package com.tom.chapter00.beanannotation.service;

import com.tom.chapter00.beanannotation.repository.RepositoryA;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName ServiceA.java
 * @Description TODO
 * @createTime 2024年10月27日 21:31:00
 */
public class ServiceA {

    private RepositoryA repositoryA;

    public ServiceA(RepositoryA repositoryA) {
        this.repositoryA = repositoryA;
    }

    public void printRepository() {
        System.out.println("repositoryA=" + repositoryA);
    }
}
