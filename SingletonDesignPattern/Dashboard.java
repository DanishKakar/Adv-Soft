package SingletonDesignPattern;

public class Dashboard {
    
    public void foo(){
    /** Plain Old CLR Object (POCO) - which class just hold data called poco in .net and called pojo in java.
        Plain Old java Object (POJO)
    */
        Setting ob = factory.createInstance();
        ob.SetThems("Light Mode!");
        System.out.println(ob.getThems()); 
        
    }
}
