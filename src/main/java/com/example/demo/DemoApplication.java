package com.example.demo;

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
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		//Exercises 1: Filter product by specification
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
  		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
    	Product house = new Product("House", Color.BLUE, Size.LARGE);
    	List<Product> products = Arrays.asList(apple, tree, house);

    	//Solution 1: Make one clases with n diferents method for each filter
		System.out.println("Green Products: ");
    	ProductFilter productFilter = new ProductFilter();
		productFilter.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(p.getName() + " is green"));

		//Solution 2: Make one clase for each filter
		FilterByProduct filterByProduct = new FilterByProduct();
		Specification specification = new SpecificationByColor(Color.GREEN);
		System.out.println("Good practice filtering products: ");
		filterByProduct.filter(products, specification).forEach(p -> System.out.println(((Product) p).getName() + " is green"));

		//Combinacion
		filterByProduct.filter(products, new SpecificationWithAnd<>(new SpecificationByColor(Color.BLUE), new SpecificationBySize(Size.LARGE))).forEach(p -> System.out.println(p.getName() + " is Blue and is Large"));
	}

}
