package com.tom.springbootdiscover.cache.domain;

import lombok.Data;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName Employee.java
 * @Description TODO
 * @createTime 2025年10月23日 07:00:00
 */
@Data
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer deptId;
}