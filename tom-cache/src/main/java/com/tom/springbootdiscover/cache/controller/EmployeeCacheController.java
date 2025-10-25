package com.tom.springbootdiscover.cache.controller;

import com.tom.springbootdiscover.cache.application.EmployeeAppService;
import com.tom.springbootdiscover.cache.application.EmployeeAppServiceUsingCacheConfig;
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
public class EmployeeCacheController {

    private static final Logger log = LoggerFactory.getLogger(EmployeeCacheController.class);
    @Autowired
    private EmployeeAppServiceUsingCacheConfig employeeAppService;

    @PostMapping(path = "/getEmpByLastName", consumes="application/json;charset=UTF-8")
    public Employee getEmpByLastName(@RequestBody Employee employee){
        return employeeAppService.getEmpByLastName(employee.getLastName());
    }

    @PostMapping(path = "/getCachedEmpByLastName", consumes="application/json;charset=UTF-8")
    public Employee getCachedEmpByLastName(@RequestBody Employee employee){
        return employeeAppService.getCachedEmpByLastName(employee.getLastName());
    }
}
