package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.MyGreetingsImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorBasedControllerTest {

    ConstructorBasedController constructorBasedController;

    @BeforeEach
    void setUp() {
        constructorBasedController = new ConstructorBasedController(new MyGreetingsImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorBasedController.getGreeting());
    }
}
