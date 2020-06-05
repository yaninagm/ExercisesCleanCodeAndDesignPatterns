package com.example.demo.LiskovSustitutionPrinciple.goodPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunDemo {

	public static void main(String[] args) {
		SpringApplication.run(RunDemo.class, args);

		Rectangle r = new Rectangle(2, 3);
		userIt(r);

		System.out.println(">>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");

		Rectangle sqr = new Square();
		sqr.setWidth(5);
		System.out.println(">>> sqr height: "+sqr.getHeight());
		userIt(sqr);
	}


	static void userIt(Rectangle r) {
		int weidth = r.getWidth();
		System.out.println(">>> width: " + weidth);
		r.setHeight(10);
		System.out.println("Yo espero que el area de " + weidth * 10 + " y fue:  " + r.getArea());

	}

}
