package Proxy;

public class ValidationStringService implements StringService{
    private final StringService realService;
    
    public ValidationStringService() {
        this.realService = new RealStringService();
    }
    
    @Override
    public String process(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string must not be null or empty");
        }
        
        return realService.process(input);
    }
}
