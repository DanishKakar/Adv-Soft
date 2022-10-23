package Beverage;
import Coffee.Coffee;

public class Whip extends Coffee{
        
    Coffee coffee;
    
    public Whip(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.3;
    }
}
