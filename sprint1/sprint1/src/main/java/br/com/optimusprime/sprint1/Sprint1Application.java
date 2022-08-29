package br.com.optimusprime.sprint1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.optimusprime.sprint1.config"})
public class Sprint1Application {
	public static void main(String[] args) {
		SpringApplication.run(Sprint1Application.class, args);
	}
}
