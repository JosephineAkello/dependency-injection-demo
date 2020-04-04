package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.MyGreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final MyGreetingsService myGreetingsService;

    public MyController(MyGreetingsService myGreetingsService) {
        this.myGreetingsService = myGreetingsService;
    }


    public String sayHello(){
        return myGreetingsService.sayGreeting();
    }
}
