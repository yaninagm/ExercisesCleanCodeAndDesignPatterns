package com.example.demo.openClosedPrinciple.goodPractice;

import com.example.demo.openClosedPrinciple.Color;
import com.example.demo.openClosedPrinciple.Product;

public class SpecificationByColor implements Specification<Product> {

    private Color color;
    public SpecificationByColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == color;
    }
}
