package com.example.solid;

import com.example.solid.singlerepo.SingleRepoPrinciple;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolidApplication.class, args);

		// SINGLE REPOSITORY PRINCIPLE
		SingleRepoPrinciple singleRepoPrinciple = new SingleRepoPrinciple();
		singleRepoPrinciple.printDetails();

		//OPEN-CLOSE PRINCIPLE


		//LISKOV SUBSTITUTION PRINCIPLE


		// INTERFACE SEGREGATION PRINCIPLE


		// DEPENDENCY INVERSION PRINCIPLE

	}

}
