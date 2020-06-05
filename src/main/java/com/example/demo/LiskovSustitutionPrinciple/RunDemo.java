package com.example.demo.LiskovSustitutionPrinciple;

import com.example.demo.openClosedPrinciple.Color;
import com.example.demo.openClosedPrinciple.Product;
import com.example.demo.openClosedPrinciple.Size;
import com.example.demo.openClosedPrinciple.goodPractice.*;
import com.example.demo.openClosedPrinciple.wrongPractice.ProductFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class RunDemo {

	public static void main(String[] args) {
		SpringApplication.run(RunDemo.class, args);
		Rectangle r = new Rectangle(2, 3);
		userIt(r);
	}
	static void userIt(Rectangle r) {

		int weidth = r.getWidth();
		System.out.println(" >>>>>: "+ weidth);
		r.setWidth(10);

		System.out.println("Yo espero que el area de " + weidth * 10 + " pero fue:  " + r.getArea());

	}

}
