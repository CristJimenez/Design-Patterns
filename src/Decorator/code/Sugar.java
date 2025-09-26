package Decorator.code;

public class Sugar extends ComplementDecorator {
    public Sugar(Drink drink) {
        super(drink);
    }
    
    @Override
    public String getDescription() {
        return drink.getDescription() + ", Sugar";
    }
    
    @Override
    public double cost() {
        return drink.cost() + 500;
    }
}
