package com.homeofthewizard;

import com.google.inject.AbstractModule;

import javax.inject.Named;

@Named
public class MyModule extends AbstractModule {

    @Override
    public void configure() {
        bind(MyComponent.class).toInstance(new MyComponent());
    }
}
