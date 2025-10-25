package com.tom.springbootdiscover.cache.controller;

import com.tom.springbootdiscover.cache.application.EmployeeAppService;
import com.tom.springbootdiscover.cache.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName EmployeeController.java
 * @Description TODO
 * @createTime 2025年10月23日 06:57:00
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeAppService employeeAppService;

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeAppService.getEmpById(id);
    }
}
