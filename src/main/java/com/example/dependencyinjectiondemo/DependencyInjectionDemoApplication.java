package com.example.dependencyinjectiondemo;

import com.example.dependencyinjectiondemo.contollers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeeting = myController.sayHello();

		System.out.println(greeeting);
	}

}
