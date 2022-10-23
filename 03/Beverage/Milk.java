package Beverage;

import Coffee.Coffee;

public class Milk extends Coffee{
    
        Coffee coffee;
    
        public Milk(Coffee coffee){
            this.coffee = coffee;
        }
    
        @Override
        public double cost() {
            return coffee.cost() + 0.5;
        }
}
