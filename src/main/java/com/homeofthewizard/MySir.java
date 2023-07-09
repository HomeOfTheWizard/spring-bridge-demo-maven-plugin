package com.homeofthewizard;

import com.homeofthewizard.hellolib.MyHelloer;

public class MySir implements MyHelloer {

    public void hello(){
        System.out.println( "Hello Sir! I am a pojo directly injected with maven plexus" );
    }
}