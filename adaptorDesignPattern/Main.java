import Turkey.Turkey;

public class Main {

    public static void main(String[] args) {
        Turkey tu = new Turkey();
        TurkeyAdopter t = new TurkeyAdopter(tu);

        t.fly();
        t.swimQuack();

    }
}