package com.tom.springbootdiscover.cache.infrastructure.mapper;

import com.tom.springbootdiscover.cache.domain.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName EmployeeMapper.java
 * @Description TODO
 * @createTime 2025年10月23日 07:02:00
 */
@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM employee WHERE id = #{id}")
    public Employee getEmpById(Integer id);

    @Insert("INSERT INTO employee(lastName,email,gender,dept_id) VALUES(#{lastName},#{email},#{gender},#{deptId})")
    public void insertEmp(Employee employee);

    @Update("UPDATE employee SET lastName = #{lastName},email = #{email},gender = #{gender},dept_id = #{deptId} WHERE id = #{id}")
    public void updateEmp(Employee employee);

    @Delete("DELETE FROM employee WHERE id = #{id}")
    public void deleteEmpById(Integer id);

    @Select("SELECT * FROM employee WHERE last_name = #{lastName}")
    public Employee getEmpByLastName(String lastName);
}

