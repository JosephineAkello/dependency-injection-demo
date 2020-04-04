package com.example.dependencyinjectiondemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements MyGreetingsService {

    @Override
    public String sayGreeting() {
        return "Heeey ..EN service";
    }
}
