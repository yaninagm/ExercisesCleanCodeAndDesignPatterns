package com.example.demo.LiskovSustitutionPrinciple.wrongPractice;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(int size) {
        height = width = size;
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }
    // AQUI VIOLO LSP
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
