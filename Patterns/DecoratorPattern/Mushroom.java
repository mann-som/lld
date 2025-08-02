package Patterns.DecoratorPattern;

public class Mushroom extends ToppingsDecorator {
    
    // Pizza pizza;

    public Mushroom(Pizza pizza){
        super(pizza);
    }

    public int getCost(){
        return pizza.getCost() + 30;
    }

    public String getDescription(){
        return pizza.getDescription() + " with Mushroom";
    }
}
