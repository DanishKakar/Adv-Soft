package Beverage;
import Coffee.Coffee;

public class Darkrost extends Coffee{
    
    Coffee coffee;

    public Darkrost(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.7;
    }
}
