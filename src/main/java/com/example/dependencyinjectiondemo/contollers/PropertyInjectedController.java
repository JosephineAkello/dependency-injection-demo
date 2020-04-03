package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.MyGreetings;

public class PropertyInjectedController{

    public MyGreetings myGreetings;

    public String getGreeting(){

        return myGreetings.sayGreeting();
    }

}
