package com.zpower.restservice;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.zpower.restservice.demo.entity.Employee;
import com.zpower.restservice.demo.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;


@SpringBootTest
class RestServiceApplicationTests {


    @Autowired
    DataSource dataSource;

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void dataSourceLoads() {
        System.out.println(this.dataSource.toString());
    }
    
    @Test
    void mybatisSelect() {
//        Employee employee = employeeMapper.findById("2");
//        if(employee != null) {
//            System.out.println(employee.toString());
//        } else {
//            System.out.println("employee is null!");
//        }
    }

}
