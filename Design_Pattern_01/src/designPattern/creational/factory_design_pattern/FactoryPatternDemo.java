package designPattern.creational.factory_design_pattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory=new ShapeFactory ();
        shapeFactory.getShape ("Circle").draw ();
        shapeFactory.getShape ("Square").draw ();
    }
}
