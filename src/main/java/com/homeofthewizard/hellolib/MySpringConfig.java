package com.homeofthewizard.hellolib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfig {
    @Bean
    public MyHelloer myHelloerBean(){
        return new MyFriend();
    }
}
