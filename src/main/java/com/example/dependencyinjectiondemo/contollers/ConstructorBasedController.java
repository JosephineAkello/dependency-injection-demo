package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.MyGreetingsService;

public class ConstructorBasedController{

    private final MyGreetingsService myGreetingsService;

    public ConstructorBasedController(MyGreetingsService myGreetingsService) {
        this.myGreetingsService = myGreetingsService;
    }

    public String getGreeting(){
        return  myGreetingsService.sayGreeting();
    }
}
