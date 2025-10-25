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
    private Integer order;

    public static Employee build(Integer id, Integer order) {
        Employee employee = new Employee();
        employee.id = id;
        employee.order = order ;
        return employee;
    }
}
