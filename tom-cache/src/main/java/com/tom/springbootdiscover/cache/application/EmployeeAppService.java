package com.tom.springbootdiscover.cache.application;

import com.tom.springbootdiscover.cache.domain.Employee;
import com.tom.springbootdiscover.cache.infrastructure.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName EmployeeAppService.java
 * @Description TODO
 * @createTime 2025年10月23日 06:59:00
 */
@Service
@RequiredArgsConstructor
public class EmployeeAppService {

    private final EmployeeMapper employeeMapper;

    public Employee getEmpById(Integer id){
        Employee emp = employeeMapper.getEmpById(id);
        return emp;
    }
}
