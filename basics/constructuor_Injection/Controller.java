public class Controller{
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }
    public void handleRequest(){
        service.doSomething();
        
    }
}