package designPattern.creational.single_designPattern;

public class SingletonDemo {
    public static void main(String[] args) {

        Singleton singleton=Singleton.getInstance ();
        singleton.showMessage ();

        //2 Method
       // Singleton.getInstance ().showMessage ();
    }
}
