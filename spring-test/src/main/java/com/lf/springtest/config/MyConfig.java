package com.lf.springtest.config;

import com.lf.springtest.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Cat cat(){
        return new Cat();
    }
}
