package com.example.demo.openClosedPrinciple.ownResolution;

import com.example.demo.openClosedPrinciple.Color;
import com.example.demo.openClosedPrinciple.Product;
import com.example.demo.openClosedPrinciple.Size;

import java.util.List;
import java.util.stream.Stream;

public interface Condition {
    public Boolean isEqual(Product product);
}
