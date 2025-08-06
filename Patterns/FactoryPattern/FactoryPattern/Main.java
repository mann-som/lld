package Patterns.FactoryPattern.FactoryPattern;

public class Main {

    public static void main(String args[]){

        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj = shapeFactoryObj.getShape("CIRCLE");
        Shape shapeObj2 = shapeFactoryObj.getShape("RECTANLE");
        shapeObj.draw();
        shapeObj2.draw();
    }
    
}
