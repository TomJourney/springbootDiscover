package com.tom.springbootdiscover.cache.application;

import com.tom.springbootdiscover.cache.domain.Employee;
import com.tom.springbootdiscover.cache.infrastructure.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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
@Slf4j
public class EmployeeAppService {

    private static final Logger log = LoggerFactory.getLogger(EmployeeAppService.class);
    private final EmployeeMapper employeeMapper;

    /**
     * @description 根据id获取员工信息。
     * 补充：@Cacheable 若缓存容器中key等于id的缓存存在，则使用缓存，
     *      否则查询数据库，并把查询结果重新放入缓存。
     * 补充2：缓存key默认是入参id的值。
     * @param
     * @return 
     * @throws 
     * @author tom
     * @datetime 2025/10/25 20:34 
     */
    @Cacheable(cacheNames = {"emp"})
    public Employee getEmpById(Integer id){
        Employee emp = employeeMapper.getEmpById(id);
        log.info("EmployeeAppService getEmpById called. ");
        return emp;
    }

    /**
     * @description 更新员工信息。@CachePut：强行更新缓存，即无论缓存是否存在都会查询数据库，
     *               并把查询结果重新放入缓存
     *               补充： 缓存key等于employee.id属性值
     * @param
     * @return
     * @throws
     * @author tom
     * @datetime 2025/10/25 20:35
     */
    @CachePut(value = "emp",key = "#employee.id")
    public Employee updateEmp(Employee employee){
        employeeMapper.updateEmp(employee);
        return employee;
    }

    /**
     * @description 删除员工。 @CacheEvict：清除缓存。
     *              其中beforeInvocation = true表示方法调用前清除缓存。
     * @param
     * @return
     * @throws
     * @author tom
     * @datetime 2025/10/25 20:36
     */
    @CacheEvict(value = "emp",key = "#id",beforeInvocation = true)
    public void delEmp(Integer id){
        employeeMapper.deleteEmpById(id);
    }
}
