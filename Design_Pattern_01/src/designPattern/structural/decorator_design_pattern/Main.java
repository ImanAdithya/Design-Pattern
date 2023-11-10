package designPattern.structural.decorator_design_pattern;

import lk.ijse.designPattern.structural.decorator_design_pattern.Circle;
import lk.ijse.designPattern.structural.decorator_design_pattern.Rectangle;
import lk.ijse.designPattern.structural.decorator_design_pattern.RedShapeDecorator;
import lk.ijse.designPattern.structural.decorator_design_pattern.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle=new Circle ();
        Shape redCirle=new RedShapeDecorator (new Circle ());
        Shape redRectangle=new RedShapeDecorator (new Rectangle ());
        System.out.println ("Circle With out Bordere");
        circle.draw ();
        System.out.println ("Circle With Red Border");
        redCirle.draw ();
        System.out.println ("Rectangle With red Border");
        redRectangle.draw ();
    }
}
