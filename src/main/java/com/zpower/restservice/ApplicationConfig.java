package com.zpower.restservice;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ApplicationConfig {
//    @Bean
//    @ConfigurationProperties("spring.datasource.druid")
//    public DataSource dataSource() {
//        return DruidDataSourceBuilder.create().build();
//    }
}
