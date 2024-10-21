package VisitorPattern.shape;


import VisitorPattern.visitor.Visitor;

public interface Shape {
    void accept(Visitor visitor);
}
