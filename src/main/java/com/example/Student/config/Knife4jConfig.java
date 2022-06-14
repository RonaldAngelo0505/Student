package com.example.Student.config;

 import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //Is the current package path, controller class package
                .apis(RequestHandlerSelectors.basePackage("com.example.Student.studentinfo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    //Build api document details function
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //Page title
                .title("Pinkadoodle")
                //Creator
                .contact(new Contact("PinkyPinkPink", "https://www.epon,ph",
                        "postmaster@epon.ph"))
                //Version number
                .version("1.0")
                //describe
                .description("system API describe")
                .build();

    }
}
