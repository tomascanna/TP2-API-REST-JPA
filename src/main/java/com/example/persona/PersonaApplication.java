package com.example.persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonaApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(PersonaApplication.class, args);
		}catch (Exception e){
			System.out.println("Error:: "+e.getMessage());
		}

	}

}
