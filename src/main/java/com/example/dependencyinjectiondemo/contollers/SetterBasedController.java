package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.MyGreetingsService;

public class SetterBasedController{

    private MyGreetingsService myGreetingsService;

    public  void setMyGreetingsService(MyGreetingsService myGreetingsService){
        this.myGreetingsService = myGreetingsService;
    }

    public String getGreeting(){
        return  myGreetingsService.sayGreeting();
    }

}
