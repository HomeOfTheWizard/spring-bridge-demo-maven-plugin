package com.homeofthewizard;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.guice.module.SpringModule;

import javax.inject.Named;

@Named
public class MySpringModule extends SpringModule {

    public MySpringModule(){
        super(new AnnotationConfigApplicationContext(SpringConfig.class));
    }

}
