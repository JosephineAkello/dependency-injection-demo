package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.MyGreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController{


    @Autowired
    public MyGreetingsService myGreetings;


    public String getGreeting(){

        return myGreetings.sayGreeting();
    }

}
