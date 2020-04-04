package com.example.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyBasedGreetingService implements MyGreetingsService {

    @Override
    public String sayGreeting() {
        return "Hello world..property";
    }

}
