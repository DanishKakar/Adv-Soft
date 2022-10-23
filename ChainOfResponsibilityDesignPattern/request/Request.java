package ChainOfResponsibilityDesignPattern.request;

import java.util.List;

public class Request {

    public Object data;
    public List<String> message ;


    public Request(Object data) {
        this.data = data;
    }

    // public void setMessage(List<String> message) {
    //     this.message = message;
    // }

    // public List<String> getMessage() {
    //     return message;
    // }

    // public void setData(Object data) {
    //     this.data = data;
    // }

    // public Object getData() {
    //     return data;
    // }

}
