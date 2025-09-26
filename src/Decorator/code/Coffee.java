package Decorator.code;

public class Coffee implements Drink {
    @Override
    public String getDescription() {
        return "Coffee";
    }
    
    @Override
    public double cost() {
        return 1000;
    }
}
