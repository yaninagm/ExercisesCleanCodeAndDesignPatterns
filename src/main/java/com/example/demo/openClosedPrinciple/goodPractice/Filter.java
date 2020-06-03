package com.example.demo.openClosedPrinciple.goodPractice;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
    Stream<T> filter(List<T> products, Specification<T> specification);
}
