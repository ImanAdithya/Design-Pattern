package designPattern.structural.facade;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println ("This is Rectangle");
    }
}
