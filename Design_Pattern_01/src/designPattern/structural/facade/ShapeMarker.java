package designPattern.structural.facade;

public class ShapeMarker {
    private Shape circle;
    private  Shape rectangle;

    public ShapeMarker(){
        circle=new Circle ();
        rectangle=new Rectangle ();
    }

    public void drawCircle(){
        circle.draw ();
    }
    public void drawRectangle(){
        rectangle.draw ();
    }
}
