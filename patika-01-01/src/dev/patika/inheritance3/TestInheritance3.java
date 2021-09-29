package dev.patika.inheritance3;

public class TestInheritance3 {
    public static void main(String[] args) {

        Pen pen = new Pen();

        Shape shape1 = new Circle(10.0, "Blue");
        if (shape1 instanceof Circle) {
            pen.draw((Circle) shape1);
            pen.changeColor("Aqua", (Circle) shape1);
        }

        Shape shape2 = new Rectangle("Yellow", 10, 10);
        if (shape2 instanceof Circle) {
            pen.draw((Circle) shape2);
            pen.changeColor("Brown", (Circle) shape2);
        }
    }
}
