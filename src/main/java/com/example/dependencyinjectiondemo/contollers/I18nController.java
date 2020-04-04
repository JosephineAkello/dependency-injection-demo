package com.example.dependencyinjectiondemo.contollers;

import com.example.dependencyinjectiondemo.services.MyGreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//internationalization with 18 chars
@Controller
public class I18nController {

    private final MyGreetingsService greetingsService;

    public I18nController(@Qualifier("i18nService") MyGreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.sayGreeting();

    }
}
