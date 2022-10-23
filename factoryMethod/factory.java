package factoryMethod;


public class factory {
    
    public static pizza  order(pizza pizza){

        
        if(pizza instanceof cheesePizza){
            pizza = new cheesePizza();
            return pizza;
        }
        if(pizza instanceof anarPizza){
            pizza  = new anarPizza();
            return pizza;
        }
        return pizza;
        
    }
}
