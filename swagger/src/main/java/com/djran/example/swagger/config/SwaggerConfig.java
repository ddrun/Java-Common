package com.djran.example.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    ApiInfo apiInfo=new ApiInfo(
            "Swagger Api Demo",
            "The swagger api demo",
            "1.0.1",
            null,
            "d.djrn@gmail.com",
            null,
            null
    );
    @Bean
    public Docket createSwaggerDocketByGroup1(){
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .groupName("Post")
                .select()
                .paths(regex("/post/.*")).build()
                .apiInfo(apiInfo);
        return docket;
    }
    @Bean
    public Docket createSwaggerDocketByGroup2(){
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .groupName("User")
                .select()
                .paths(regex("/user/.*")).build()
                .apiInfo(apiInfo);
        return docket;
    }
    @Bean
    public Docket createSwaggerDocketByGroup3(){
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .groupName("Role")
                .select()
                .paths(regex("/role/.*")).build()
                .apiInfo(apiInfo);
        return docket;
    }

}
