package com.example.demo.openClosedPrinciple.goodPractice;

import com.example.demo.openClosedPrinciple.Product;
import com.example.demo.openClosedPrinciple.Size;

public class SpecificationBySize implements Specification<Product>{
    private Size size;
    public SpecificationBySize(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == size;
    }
}
