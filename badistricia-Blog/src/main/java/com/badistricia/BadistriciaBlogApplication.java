package com.badistricia;

import com.sun.glass.ui.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author badistricia
 * @version 1.0
 * @description :
 * @date 2022/7/28 8:31:54
 */
@SpringBootApplication
@MapperScan("com.badistricia.domain.mapper")
public class BadistriciaBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BadistriciaBlogApplication.class,args);
    }
}
