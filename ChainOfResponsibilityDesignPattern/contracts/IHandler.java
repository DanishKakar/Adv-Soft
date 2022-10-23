package ChainOfResponsibilityDesignPattern.contracts;

import ChainOfResponsibilityDesignPattern.request.Request;

public interface IHandler {
    void process(Request request) throws Exception;

    void setNextHandler(IHandler handler);
}
