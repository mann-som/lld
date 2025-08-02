package Patterns.DecoratorPattern;

public abstract class ToppingsDecorator implements Pizza{

    protected Pizza pizza;

    public ToppingsDecorator(Pizza pizza){
        this.pizza = pizza;
    }
    
}
