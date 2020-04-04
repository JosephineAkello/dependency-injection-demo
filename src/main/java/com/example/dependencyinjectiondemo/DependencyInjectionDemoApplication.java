package com.example.dependencyinjectiondemo;

import com.example.dependencyinjectiondemo.contollers.ConstructorBasedController;
import com.example.dependencyinjectiondemo.contollers.I18nController;
import com.example.dependencyinjectiondemo.contollers.MyController;
import com.example.dependencyinjectiondemo.contollers.PropertyInjectedController;
import com.example.dependencyinjectiondemo.contollers.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(".........Primary bean");

		System.out.println(myController.sayHello());

		System.out.println(".........property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

	    System.out.println(propertyInjectedController.getGreeting());

		System.out.println(".........setter");

		SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean("setterBasedController");

		System.out.println(setterBasedController.getGreeting());

		System.out.println(".........constructor");

		ConstructorBasedController constructorBasedController = (ConstructorBasedController) ctx.getBean("constructorBasedController");

		System.out.println(constructorBasedController.getGreeting());
	}

}
