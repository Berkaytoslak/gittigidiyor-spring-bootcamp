package dev.patika.inheritance3;

public class Pen {

    public void draw(Rectangle r){
        System.out.println(r.getColor() + " Rectangle area is " + r.getArea());
    }

    public void draw(Circle c){
        System.out.println(c.getColor() + " Circle area is " + c.getArea());
    }

    public void changeColor(String color, Circle c){
        c.setColor(color);
        draw(c);
    }

    public void changeColor(String color, Rectangle r){
        r.setColor(color);
        draw(r);
    }



}
