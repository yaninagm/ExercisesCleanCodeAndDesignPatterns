package com.example.demo.LiskovSustitutionPrinciple;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(int size) {
        height = width = size;
    }

    // AQUI VIOLO LSP
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    // AQUI VIOLO LSP
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(width);
    }
}
