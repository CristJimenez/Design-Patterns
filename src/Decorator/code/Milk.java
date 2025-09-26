package Decorator.code;

public class Milk extends ComplementDecorator {
    public Milk(Drink drink) {
        super(drink);
    }
    
    @Override
    public String getDescription() {
        return drink.getDescription() + ", Milk";
    }
    
    @Override
    public double cost() {
        return drink.cost() + 1000;
    }
}
