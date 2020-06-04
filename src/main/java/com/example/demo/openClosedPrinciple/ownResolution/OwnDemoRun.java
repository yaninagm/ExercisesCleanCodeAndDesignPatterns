package com.example.demo.openClosedPrinciple.ownResolution;

import com.example.demo.openClosedPrinciple.Color;
import com.example.demo.openClosedPrinciple.Product;
import com.example.demo.openClosedPrinciple.Size;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class OwnDemoRun {

	public static void main(String[] args) {
		SpringApplication.run(OwnDemoRun.class, args);
		
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
  		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
    	Product house = new Product("House", Color.BLUE, Size.LARGE);
    	List<Product> products = Arrays.asList(apple, tree, house);


    	// Realizar los filtros necesarios
		Condition conditionByColor = new ConditionByColor(Color.GREEN);
		Condition conditionBySize = new ConditionBySize(Size.LARGE);
		Filter filter = new Filter();
		filter.filter(products, conditionByColor).forEach(p -> System.out.println("producto: "+ p.getName()));
		filter.filter(products, conditionBySize).forEach(p -> System.out.println("producto: "+ p.getName()));

		System.out.println("GREEN AND LARGE");
		filter.filterAnd(products, conditionByColor, conditionBySize).forEach(p -> System.out.println("producto: "+ p.getName()));
	}


}
