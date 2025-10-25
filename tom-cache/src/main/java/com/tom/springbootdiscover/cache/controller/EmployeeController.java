package com.tom.springbootdiscover.cache.controller;

import com.tom.springbootdiscover.cache.application.EmployeeAppService;
import com.tom.springbootdiscover.cache.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName EmployeeController.java
 * @Description TODO
 * @createTime 2025年10月23日 06:57:00
 */
@RestController
@Slf4j
public class EmployeeController {

    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeAppService employeeAppService;

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        log.info("EmployeeController getEmp() called.");
        return employeeAppService.getEmpById(id);
    }

    @PostMapping(path="/updateEmp", consumes="application/json;charset=UTF-8")
    public void updateEmp(@RequestBody Employee employee) {
        log.info("EmployeeController updateEmp() called.");
        employeeAppService.updateEmp(employee);
    }

    @GetMapping("/delEmp/{id}")
    public void delEmp(@PathVariable("id") Integer id){
        log.info("EmployeeController delEmp() called.");
        employeeAppService.delEmp(id);
    }

}
