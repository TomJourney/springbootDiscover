package com.tom.springbootdiscover.cache.application;

import com.tom.springbootdiscover.cache.domain.Employee;
import com.tom.springbootdiscover.cache.infrastructure.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.*;
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
@CacheConfig(cacheNames = "emp2")
public class EmployeeAppServiceUsingCacheConfig {

    private static final Logger log = LoggerFactory.getLogger(EmployeeAppServiceUsingCacheConfig.class);
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
    @Cacheable
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
    @CachePut(key = "#employee.id")
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
    @CacheEvict(key = "#lastName",beforeInvocation = true)
    public void delEmp(Integer id){
        employeeMapper.deleteEmpById(id);
    }

    /**
     * @description 根据姓名查询员工信息。
       补充： @Caching @Cacheable、@CachePut、@CacheEvict的组合，定义复杂的缓存规则，
             在这个组合中只要有@CachePut就一定会调用被注解的方法。
     * @param
     * @return
     * @throws
     * @author tom
     * @datetime 2025/10/25 21:00
     */
    @Caching(
            cacheable = {
                    @Cacheable(key="#lastName")
            },
            put={
                    @CachePut(key="#result.id"),
                    @CachePut(key="#result.lastName"),
                    @CachePut(key="#result.email")
            }
    )
    public Employee getEmpByLastName(String lastName) {
        return employeeMapper.getEmpByLastName(lastName);
    }

    @Caching(
         cacheable = {
                 @Cacheable(key="#lastName")
         }
    )
    public Employee getCachedEmpByLastName(String lastName) {
        return employeeMapper.getEmpByLastName(lastName);
    }
}
