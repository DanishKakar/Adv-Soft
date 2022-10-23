package ChainOfResponsibilityDesignPattern.handlers;

import ChainOfResponsibilityDesignPattern.OSI;
import ChainOfResponsibilityDesignPattern.contracts.BaseHandler;
import ChainOfResponsibilityDesignPattern.request.Request;

public class Application extends BaseHandler {
    
    @Override
    public void process(Request request) throws Exception{
        
        if(request.data instanceof OSI osi){
            if(osi.text.length() < 4) request.message.add("out of bound");
            if(_handler != null) _handler.process(request);
        } else {
            throw new Exception("invalid arguments");
        }
    }

}
