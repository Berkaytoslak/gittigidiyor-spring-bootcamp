package dev.patika.polymorphism;

import java.util.Objects;

public class Circle extends Shape {

    // fields (variables)
    private double radius;

    // constructors
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    // custom methods
    @Override
    public double getArea(){
        return Math.PI * Math.pow(this.getRadius(),2);
    }

    // getters & setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // overriden equals & hashcode & toString methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
