package com.example.demo.LiskovSustitutionPrinciple.goodPractice;

public class Rectangle {
    protected int width, height;
    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int size) {
        this.width = this.height = size;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getArea(){
        return width *height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "weight=" + width +
                ", height=" + height +
                '}';
    }

    public boolean isSquare(){
        return height == width;
    }
}
