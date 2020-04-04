package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.MyGreetingsImpl;
import com.example.dependencyinjectiondemo.services.MyGreetingsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {

    SetterBasedController setterBasedController;

    @BeforeEach
    void setUp() {
        setterBasedController = new SetterBasedController();
        setterBasedController.setMyGreetingsService(new MyGreetingsImpl());


    }

    @Test
    void getGreeting(){
        System.out.println(setterBasedController.getGreeting());
        
    }
}
