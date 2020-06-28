package com.example.demo.LiskovSustitutionPrinciple.goodPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunDemo {

	public static void main(String[] args) {
		SpringApplication.run(RunDemo.class, args);

		Rectangle r = new Rectangle(2, 3);
		userIt(r);


		// Creo un cuadrado
		Rectangle sqr = new Rectangle(5);
		userIt(sqr);

		// Creo un rectangulo
		Rectangle rec = new Rectangle(2, 3);

	}

	static void userIt(Rectangle r) {
		int weidth = r.getWidth();
		r.setHeight(10);
		System.out.println("Yo espero que el area de " + weidth * 10 + " y fue:  " + r.getArea());

	}

}
