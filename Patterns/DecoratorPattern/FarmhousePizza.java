package Patterns.DecoratorPattern;

public class FarmhousePizza implements Pizza {
    
    public int getCost(){
        return 150;
    }

    public String getDescription(){
        return "Farmhouse pizza";
    }
}
