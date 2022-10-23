import IDUCK.IDuck;
import Turkey.ITurkey;

public class TurkeyAdopter implements IDuck{

    ITurkey _turkey;

    public TurkeyAdopter(ITurkey turkey){
        this._turkey = turkey;
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        _turkey.fly();
        
    }

    @Override
    public void swimQuack() {
        // TODO Auto-generated method stub
        _turkey.quack();
        _turkey.swim();
        
    }
    
}
