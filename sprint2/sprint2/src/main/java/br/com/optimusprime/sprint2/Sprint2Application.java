package br.com.optimusprime.sprint2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.optimusprime.sprint2.config", "br.com.optimusprime.sprint2.controllers"})
public class Sprint2Application {
	public static void main(String[] args) {
		SpringApplication.run(Sprint2Application.class, args);
	}
}
