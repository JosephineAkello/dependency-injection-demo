package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.MyGreetingsImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void SetUp(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.myGreetings = new MyGreetingsImpl();
    }


    @Test
    void getGreeting(){

        System.out.println(propertyInjectedController.getGreeting());

}

}
