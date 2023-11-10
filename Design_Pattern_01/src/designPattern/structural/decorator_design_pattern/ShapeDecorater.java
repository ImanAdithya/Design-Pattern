package designPattern.structural.decorator_design_pattern;

public abstract class ShapeDecorater implements Shape {

    protected Shape decoratorShape;

    public ShapeDecorater(Shape decoratorShape){
        this.decoratorShape=decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw ();
    }
}
