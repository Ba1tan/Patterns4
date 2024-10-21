package VisitorPattern;

import VisitorPattern.visitor.AreaCalculator;
import VisitorPattern.shape.Circle;
import VisitorPattern.shape.Rectangle;
import VisitorPattern.shape.Triangle;
import VisitorPattern.visitor.Drawing;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.addShape(new Circle(3.0));
        drawing.addShape(new Rectangle(4.0, 5.0));
        drawing.addShape(new Triangle(6.0, 4.0));

        AreaCalculator calculator = new AreaCalculator();
        drawing.calculateAreas(calculator);
    }
}
