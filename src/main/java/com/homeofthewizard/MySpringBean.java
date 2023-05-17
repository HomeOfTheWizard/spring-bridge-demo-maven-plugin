package com.homeofthewizard;

public class MySpringBean {

    public MySpringBean(){
        System.out.println("basic test spring bean initiated");
    }

    public void hello(){
        System.out.println( "Hello! I am a spring managed instance that is being injected with sisu" );
    }
}
