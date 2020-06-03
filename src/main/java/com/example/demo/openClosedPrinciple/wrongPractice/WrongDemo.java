package com.example.demo.openClosedPrinciple.wrongPractice;

import com.example.demo.openClosedPrinciple.Color;
import com.example.demo.openClosedPrinciple.Product;
import com.example.demo.openClosedPrinciple.Size;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class WrongDemo {

	public static void main(String[] args) {
		SpringApplication.run(WrongDemo.class, args);
		
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
  		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
    	Product house = new Product("House", Color.BLUE, Size.LARGE);
    	List<Product> products = Arrays.asList(apple, tree, house);

		System.out.println("Green Products: ");
    	ProductFilter productFilter = new ProductFilter();
		productFilter.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(p.getName() + " is green"));

	}

}
