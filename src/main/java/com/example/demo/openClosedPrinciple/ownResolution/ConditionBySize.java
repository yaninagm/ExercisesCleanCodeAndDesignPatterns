package com.example.demo.openClosedPrinciple.ownResolution;

import com.example.demo.openClosedPrinciple.Product;
import com.example.demo.openClosedPrinciple.Size;

import java.util.List;
import java.util.stream.Stream;

public class ConditionBySize implements Condition {
    Size size;
    public ConditionBySize(Size size) {
        this.size = size;
    }
    public Boolean isEqual(Product p){
        return p.getSize() == size;
    }
}
