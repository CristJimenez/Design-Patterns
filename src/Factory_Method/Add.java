package Factory_Method;

public class Add implements Operation {
    @Override
    public int makeOperation(int a, int b) {
        return a + b;
    }
}
