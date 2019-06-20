package com.jovicazoric.populator;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import com.jovicazoric.populator.service.PersonService;

@SpringBootApplication
public class PopulatorApplication implements CommandLineRunner {

	@Autowired
	private PersonService personService;
	
	public static void main(String[] args) {
		SpringApplication.run(PopulatorApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("running");
		personService.save("jovica" + new Random().nextInt(1000));
	}
}
