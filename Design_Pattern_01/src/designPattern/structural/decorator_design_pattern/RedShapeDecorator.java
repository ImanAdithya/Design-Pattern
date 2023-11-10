package designPattern.structural.decorator_design_pattern;

public class RedShapeDecorator extends ShapeDecorater{
    public RedShapeDecorator(Shape decoratorShape) {
        super (decoratorShape);
    }

    @Override
    public void draw(){
       decoratorShape.draw ();
       sendRedBorder (decoratorShape);
    }

    public void sendRedBorder(Shape decoratorShape){
        System.out.println ("border color: Red");
    }
}
