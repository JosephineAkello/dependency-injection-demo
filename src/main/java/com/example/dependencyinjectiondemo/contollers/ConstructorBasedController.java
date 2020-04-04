package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.MyGreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorBasedController{


    private final MyGreetingsService myGreetingsService;

   //we dont have to autowire since Spring this automaticlly
    public ConstructorBasedController(@Qualifier("constructorGreetingService") MyGreetingsService myGreetingsService) {
        this.myGreetingsService = myGreetingsService;
    }

    public String getGreeting(){
        return  myGreetingsService.sayGreeting();
    }
}
