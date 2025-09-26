package Decorator;

public class CoffeeShop {

    public static void main(String[] args) {
        Drink drink = new Coffee();
        System.out.println(drink.getDescription() + " $" + drink.cost());
        drink = new Milk(drink);
        System.out.println(drink.getDescription() + "\nTotal: $" + drink.cost());
        drink = new Sugar(drink);
        System.out.println(drink.getDescription() + "\nTotal: $" + drink.cost());
    }
    
}
