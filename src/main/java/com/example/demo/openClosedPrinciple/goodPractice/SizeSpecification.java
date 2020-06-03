package com.example.demo.openClosedPrinciple.goodPractice;

import com.example.demo.openClosedPrinciple.Product;
import com.example.demo.openClosedPrinciple.Size;

public class SizeSpecification implements Specification<Product>{
    private Size size;
    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == size;
    }
}
