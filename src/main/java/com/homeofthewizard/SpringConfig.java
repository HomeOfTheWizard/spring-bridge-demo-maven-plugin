package com.homeofthewizard;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MySpringBean mySpringBean(){
        return new MySpringBean();
    }
}
