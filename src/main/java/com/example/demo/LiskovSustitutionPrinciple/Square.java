package com.example.demo.LiskovSustitutionPrinciple;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(int size) {
        height = width = size;
    }

    // AQUI VIOLO LSP
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    public void newTest(){
        System.out.println(">>>>>>>>>>>>");
    }
    // AQUI VIOLO LSP
    @Override
    public void setHeight(int height) {
        System.out.println(" QUEARE setHeight");
        super.setHeight(height);
        super.setWidth(height);
    }
}
