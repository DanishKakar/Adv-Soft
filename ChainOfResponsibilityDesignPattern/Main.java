package ChainOfResponsibilityDesignPattern;

import ChainOfResponsibilityDesignPattern.handlers.Application;
import ChainOfResponsibilityDesignPattern.handlers.Linke;
import ChainOfResponsibilityDesignPattern.request.Request;

class App {
    public String text = "da";
}

public class Main {

    public static void main(String[] args) throws Exception {
    
        OSI os = new OSI();

        Request request = new Request(os.text);
        Application app = new Application();
        Linke link = new Linke();

        app.setNextHandler(link);
        app.process(request);
        

        for (String item : request.message) {
            System.out.println("M: "+item);
        }

    }
}