package factoryMethod;

public abstract class pizza {
    

    public void prepare() {
        System.out.println("Pizza ia Prepare..");
    }

    public abstract void back();

    public void cut() {
        System.out.println("Pizza ia Cut..");
    }

    public void box() {
        System.out.println("Pizza ia Boxed..");
    }
}
