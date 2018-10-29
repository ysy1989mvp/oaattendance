//package com.qkz5.oaattendance.config;
//
//import org.springframework.boot.autoconfigure.web.BasicErrorController;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import com.google.common.base.Predicate;
//import springfox.documentation.RequestHandler;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// *
// * @ClassName: SwaggerConfig.java
// * @Description: Swagger配置类
// *
// * @version: v1.1.0
// * @author: 小码哥
// * @date: Mar 16, 2017
// */
///**
// * SwaggerConfig
// */
//@Configuration
////@EnableWebMvc
//@EnableSwagger2 // 启用 Swagger
//@ComponentScan("com.qkz5.oaattendance")  //启用组件扫描
//public class Swagger2Config {
//
//    @Bean
//    public Docket createRestApi() {
//        Predicate<RequestHandler> predicate = new Predicate<RequestHandler>() {
//            @Override
//            public boolean apply(RequestHandler input) {
//                Class<?> declaringClass = input.declaringClass();
//                if (declaringClass == BasicErrorController.class)// 排除
//                    return false;
//                if(declaringClass.isAnnotationPresent(RestController.class)) // 被注解的类
//                    return true;
//                if(input.isAnnotatedWith(ResponseBody.class)) // 被注解的方法
//                    return true;
//                return false;
//            }
//        };
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .useDefaultResponseMessages(false)
//                .select()
//                .apis(predicate)
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//       return new ApiInfoBuilder()
//            .title("深蓝科技swagger调式api接口")//大标题
//            .version("1.0")//版本
//            .build();
//    }
//}