package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.MyGreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController{


    private MyGreetingsService myGreetingsService;

    @Qualifier("setterBasedService")
    @Autowired
    public  void setMyGreetingsService(MyGreetingsService myGreetingsService){
        this.myGreetingsService = myGreetingsService;
    }

    public String getGreeting(){
        return  myGreetingsService.sayGreeting();
    }

}
