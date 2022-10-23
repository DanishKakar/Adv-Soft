package SingletonDesignPattern;

public class Setting {
    // first creat the class object it self....
    // static Setting obj = null;
    String thems = "Dark Mode";

    // create private constractor....
    // private Setting(){

    // }

    // get the class obj by static methods...
    // public static Setting createInstance(){
    //     if( obj == null) {
    //         obj = new Setting();
    //         return obj;
    //     }
    //     return obj;
    // }

    public void SetThems(String tems){
        this.thems = tems;
    }

    public String getThems(){
        return this.thems;
    }
}
