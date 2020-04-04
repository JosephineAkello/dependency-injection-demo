package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorBasedControllerTest {

    ConstructorBasedController constructorBasedController;

    @BeforeEach
    void setUp() {
        constructorBasedController = new ConstructorBasedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorBasedController.getGreeting());
    }
}
