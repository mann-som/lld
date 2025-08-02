package Patterns.DecoratorPattern;

public class Main {

    public static void main(String[] args){
        Pizza pizza1 = new MargherittaPizza();
        pizza1 = new Cheese(pizza1);
        pizza1 = new Mushroom(pizza1);

        System.out.println("Order 1: " + pizza1.getDescription());
        System.out.println("Bill : " + pizza1.getCost());

        Pizza pizza2 = new Mushroom(new FarmhousePizza());
        // pizza2 = new Mushroom(new Cheese(pizza2));

        System.out.println("Order 2: " + pizza2.getDescription());
        System.out.println("Bill :  " + pizza2.getCost());
    }
    
}
