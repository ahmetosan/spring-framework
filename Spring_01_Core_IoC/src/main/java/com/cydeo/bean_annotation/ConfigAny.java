package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;

public class ConfigAny {


    @Bean
    String str() {
        return "Developer";

    }

    @Bean
    Integer numer(){

        return 100;
    }
}


