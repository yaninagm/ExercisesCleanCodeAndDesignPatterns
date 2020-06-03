package com.example.demo.openClosedPrinciple.goodPractice;

public interface Specification<T> {
    boolean isSatisfied(T item); // Nos dice si un producto en particular satisface un criterio
}
