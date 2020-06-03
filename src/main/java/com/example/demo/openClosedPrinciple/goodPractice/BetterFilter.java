package com.example.demo.openClosedPrinciple.goodPractice;

import com.example.demo.openClosedPrinciple.Product;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> products, Specification<Product> specification) {
        return products.stream().filter(p -> specification.isSatisfied(p));
    }
}
