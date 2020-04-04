package com.example.dependencyinjectiondemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements MyGreetingsService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo.. ES";
    }
}
