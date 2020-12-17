package com.zpower.restservice.demo.mapper;

import com.zpower.restservice.demo.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    Employee findById(@Param("id") String id);

}
