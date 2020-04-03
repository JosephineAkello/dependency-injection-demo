package com.example.dependencyinjectiondemo.contollers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Heey there");

        return "Hello folks";
    }
}
