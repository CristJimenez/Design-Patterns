package Proxy;

public class RealStringService implements StringService {
    @Override
    public String process(String input) {
        return input.trim().toUpperCase();
    }
}
