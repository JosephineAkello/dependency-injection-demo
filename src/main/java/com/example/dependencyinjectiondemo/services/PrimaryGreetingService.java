package com.example.dependencyinjectiondemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements MyGreetingsService{

    @Override
    public String sayGreeting() {
        return "Hello from the primary bean";
    }
}
