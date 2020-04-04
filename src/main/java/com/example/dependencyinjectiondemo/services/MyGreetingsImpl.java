package com.example.dependencyinjectiondemo.services;

public class MyGreetingsImpl implements MyGreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello world";
    }
}
