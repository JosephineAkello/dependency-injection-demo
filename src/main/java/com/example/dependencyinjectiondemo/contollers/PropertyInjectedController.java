package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.MyGreetingsService;

public class PropertyInjectedController{

    public MyGreetingsService myGreetings;

    public String getGreeting(){

        return myGreetings.sayGreeting();
    }

}
