package com.SALARY.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author shikundai
 * @date 2021/7/28
 * @time 15:30
 * @description: swagger 配置文件
 * @Configuration  配置文件注解
 * @EnableSwagger2 对swagger支持的注解
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.SALARY.Controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("测试项目")
                .description("这个项目只是用于测试使用")
                .termsOfServiceUrl("http://192.168.1.198:10070/platformgroup/ms-admin")
                .contact("shikundai")
                .version("2.0")
                .build();
    }
}
