package com.example.demo.openClosedPrinciple.goodPractice;

import com.example.demo.openClosedPrinciple.Color;
import com.example.demo.openClosedPrinciple.Product;

public class ColorSpecification implements Specification<Product> {

    private Color color;
    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor() == color;
    }
}
