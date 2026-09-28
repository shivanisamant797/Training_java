package com.shivani.shivani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ShivaniApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(ShivaniApplication.class, args);
		Dev obj=context.getBean(Dev.class);
		obj.build();

	}

}
