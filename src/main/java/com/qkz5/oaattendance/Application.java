package com.qkz5.oaattendance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;


@SpringBootApplication
//@EnableConfigurationProperties
//@EnableSwagger2             //启动swagger注解
//开启通用注解扫描
@EnableRedisHttpSession
//@EnableCaching
public class Application extends SpringBootServletInitializer{
	/**
     * 实现SpringBootServletInitializer可以让spring-boot项目在web容器中运行
     */
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
	//用来运行程序
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}