package com.example.demo.openClosedPrinciple.ownResolution;

import com.example.demo.openClosedPrinciple.Product;

import java.util.List;
import java.util.stream.Stream;

public class Filter {
    public Stream<Product> filter(List<Product> products, Condition condition){
        return products.stream().filter(product -> condition.isEqual(product));
    }

    public Stream<Product> filterAnd(List<Product> products, Condition condition1, Condition condition2){
        return products.stream().filter(product -> condition1.isEqual(product) && condition2.isEqual(product));
    }
}
