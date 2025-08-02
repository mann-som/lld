package Patterns.DecoratorPattern;

public class Cheese extends ToppingsDecorator {
    
    public Cheese(Pizza pizza){
        super(pizza);
    }

    public int getCost(){
        return pizza.getCost() + 20;
    }

    public String getDescription(){
        return pizza.getDescription() + " with extra cheese";
    }
}
