package dev.patika.inheritance1;

import java.text.DecimalFormat;

public class TestArea {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0, "Black");
        System.out.println(circle.getColor() + " Circle area is " + circle.getArea());
        System.out.println(circle.getColor() + " Circle area is " + new DecimalFormat("##.##").format(circle.getArea()));

        Cylinder cylinder = new Cylinder(10.0, "Blue" , 15.0);
        System.out.println(cylinder.getColor() + " Cylinder area is " + cylinder.getArea());
        System.out.println(cylinder.getColor() + " Cylinder volume is " + cylinder.getVolume());

    }
}
