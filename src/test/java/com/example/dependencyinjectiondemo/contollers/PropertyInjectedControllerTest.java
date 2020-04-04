package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void SetUp(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.myGreetings = new ConstructorGreetingService();
    }


    @Test
    void getGreeting(){

        System.out.println(propertyInjectedController.getGreeting());

}

}
