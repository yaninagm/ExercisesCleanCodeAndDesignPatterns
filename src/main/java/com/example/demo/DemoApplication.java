package com.example.demo;

import com.example.demo.openClosedPrinciple.Color;
import com.example.demo.openClosedPrinciple.Product;
import com.example.demo.openClosedPrinciple.Size;
import com.example.demo.openClosedPrinciple.problema.ProductFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
  		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
    	Product house = new Product("House", Color.BLUE, Size.LARGE);
    	List<Product> products = Arrays.asList(apple, tree, house);

		System.out.println("Green Products: ");
    	ProductFilter productFilter = new ProductFilter();
		productFilter.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(p.getName() + " is green"));

	}

}
