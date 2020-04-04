package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedControllerTest {

    SetterBasedController setterBasedController;

    @BeforeEach
    void setUp() {
        setterBasedController = new SetterBasedController();
        setterBasedController.setMyGreetingsService(new ConstructorGreetingService());


    }

    @Test
    void getGreeting(){
        System.out.println(setterBasedController.getGreeting());
        
    }
}
