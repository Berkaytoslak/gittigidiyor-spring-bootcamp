package dev.patika.polymorphism;

public class TestPoly {
    public static void main(String[] args) {

        Pen pen = new Pen();
       // Shape shape = new Shape();

        Shape s = new Circle(10.0, "Green");
        pen.draw(s);
        pen.changeColor("Yellow", s);

        Shape s1 = new Rectangle("Black", 10.0, 12.0);
        pen.draw(s1);
        pen.changeColor("White", s1);

    }
}
