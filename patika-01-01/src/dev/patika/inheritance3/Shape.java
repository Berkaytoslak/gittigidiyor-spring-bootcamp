package dev.patika.inheritance3;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        System.out.println("There is no definite shape for calculating area...");
        return 0;
    }
}
