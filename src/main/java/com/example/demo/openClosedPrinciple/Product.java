package com.example.demo.openClosedPrinciple;

public class Product{
	private final String name;
	private final Color color;
	private final Size size;

	public Product(String name, Color color, Size size){
		this.name = name;
		this.color = color;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public Size getSize() {
		return size;
	}
}
