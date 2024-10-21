package VisitorPattern.visitor;


import VisitorPattern.shape.Circle;
import VisitorPattern.shape.Rectangle;
import VisitorPattern.shape.Triangle;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);
}
