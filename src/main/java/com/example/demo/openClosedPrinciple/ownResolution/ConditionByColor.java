package com.example.demo.openClosedPrinciple.ownResolution;

import com.example.demo.openClosedPrinciple.Color;
import com.example.demo.openClosedPrinciple.Product;

import java.util.List;
import java.util.stream.Stream;

public class ConditionByColor implements Condition {
    Color color;
    public ConditionByColor(Color color) {
        this.color = color;
    }
    public Boolean isEqual(Product product){
        return  product.getColor() == color;
    }

}