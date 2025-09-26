package Decorator.code;

public abstract class ComplementDecorator implements Drink {
    protected Drink drink;
    
    public ComplementDecorator(Drink drink) {
        this.drink = drink;
    }
}
