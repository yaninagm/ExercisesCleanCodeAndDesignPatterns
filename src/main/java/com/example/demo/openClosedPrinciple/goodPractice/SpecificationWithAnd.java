package com.example.demo.openClosedPrinciple.goodPractice;

import com.example.demo.openClosedPrinciple.Product;

public class SpecificationWithAnd<T> implements Specification<T> {

    private Specification<T> first;
    private Specification<T> second;

    public SpecificationWithAnd(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
