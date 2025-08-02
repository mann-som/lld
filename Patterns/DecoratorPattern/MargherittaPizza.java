package Patterns.DecoratorPattern;

public class MargherittaPizza implements Pizza {
    
    public int getCost(){
        return 100;
    }

    public String getDescription(){
        return "Margheritta Pizza";
    }
}
