package ChainOfResponsibilityDesignPattern.contracts;

import ChainOfResponsibilityDesignPattern.request.Request;

public class BaseHandler implements IHandler {

    protected IHandler _handler;

    public BaseHandler() {
        _handler = null;
    }

    @Override
    public void process(Request request) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setNextHandler(IHandler handler) {
        
        _handler = handler;
        
    }
    
}
