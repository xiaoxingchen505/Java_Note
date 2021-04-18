package hello;


public class MessageService {

    public MessageService() {
        super();
        System.out.println("MessageServer...");
    }

    public String getMessage(){
        return "Hello Spring";
    }
}
