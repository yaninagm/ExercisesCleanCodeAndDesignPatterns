package com.example.demo.LiskovSustitutionPrinciple.wrongPractice;

public class Rectangle {
    protected int width, height;
    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
}
