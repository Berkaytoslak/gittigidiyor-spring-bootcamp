package dev.patika.inheritance2;

public class TestInheritance2 {
    public static void main(String[] args) {

        Circle circle = new Circle(10.0 , "Blue");
        System.out.println(circle.getColor() + " Circle area is " + circle.getArea());

        Rectangle rectangle = new Rectangle("Yellow", 10, 10);
        System.out.println(rectangle.getColor() + " Rectangle area is " + rectangle.getArea());

    }
}
