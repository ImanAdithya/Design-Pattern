package designPattern.structural.facade;

import lk.ijse.designPattern.structural.facade.ShapeMarker;

public class FacadeDemo {
    public static void main(String[] args) {

        ShapeMarker shapeMarker=new ShapeMarker ();
        shapeMarker.drawCircle ();
        shapeMarker.drawRectangle ();
    }
}
