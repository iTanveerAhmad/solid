package com.example.solid;

import com.example.solid.openclose.Car;
import com.example.solid.openclose.Truck;
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
		Car car= new Car();
		car.getCarNumber();

		Truck truck = new Truck();
		truck.getTruckNumber();

		//LISKOV SUBSTITUTION PRINCIPLE


		// INTERFACE SEGREGATION PRINCIPLE


		// DEPENDENCY INVERSION PRINCIPLE

	}

}
