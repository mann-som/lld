package Patterns.FactoryPattern.FactoryPattern;

public class ShapeFactory {
    
    Shape getShape(String input){

        switch (input){

            case "CIRCLE":
                return new Circle();
            case "RECTANLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
