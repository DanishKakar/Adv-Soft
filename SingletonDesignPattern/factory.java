package SingletonDesignPattern;

public class factory {
    
    static Setting _setting = null;

    public static Setting createInstance(){
        if( _setting == null) {
            _setting = new Setting();
            return _setting;
        }
        return _setting;
    }
}
