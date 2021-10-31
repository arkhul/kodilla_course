package com.kodilla.spring.intro.shape;

public class Drawer {

//    public void doDrawing() {
//        Circle circle = new Circle();
//        Triangle triangle = new Triangle();
//
//        circle.draw();
//        triangle.draw();
//    }

//    public void doDrawing() {
//
//        Figure figure;
//
//        figure = new Circle();
//        figure.draw();
//
//        figure = new Triangle();
//        figure.draw();
//    }

    final Shape shape;

    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public String doDrawing() {
        return shape.draw();
    }
}
