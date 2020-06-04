package com.example.demo.openClosedPrinciple.ownResolution;

import com.example.demo.openClosedPrinciple.Product;

public class ConditionWithAnd implements Condition {
    Condition condition1;
    Condition condition2;

    public ConditionWithAnd(Condition condition1, Condition condition2) {
        this.condition1 = condition1;
        this.condition2 = condition2;
    }

    @Override
    public Boolean isEqual(Product product) {
        return condition1.isEqual(product) && condition2.isEqual(product);
    }
}
