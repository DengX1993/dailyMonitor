package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.cn.computer.dao.mapper")
public class DailyMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyMonitorApplication.class, args);
    }

}
