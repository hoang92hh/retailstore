package com.example.retailtstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.annotation.Persistent;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DataSourceConfig {


//    @Bean
//    public DataSource dataSource(){
//         DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
//         dataSourceBuilder.driverClassName("org.postgresql.Driver");
//         dataSourceBuilder.url("jdbc:postgresql://localhost:5432/retail_store_youtube");
//         dataSourceBuilder.username("postgres");
//         dataSourceBuilder.password("h123");
////        System.out.println("build data success");
//         return dataSourceBuilder.build();
//    }

    @Bean(name = "dataSoure")
//    @Primary
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/retail_store_youtube");
        dataSource.setUsername("postgres");
        dataSource.setPassword("h123");
        System.out.println("tao duoc datasoure");
        return dataSource;
    }



}