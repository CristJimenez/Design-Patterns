package Proxy.code;

public class ProxyMain {

    public static void main(String[] args) {
        StringService service = new ValidationStringService();
        
        String processed = service.process("  Hello dear User  ");
        System.out.println(processed);
        
        try {
            service.process("");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
    
}
