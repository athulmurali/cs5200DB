package com.example.cs5200spring2018muralidharan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;






@SpringBootApplication
public class SpringBootAwsApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder
    configure(SpringApplicationBuilder application) {
        return application.sources(
                SpringBootAwsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAwsApplication.class, args);
    }
}
