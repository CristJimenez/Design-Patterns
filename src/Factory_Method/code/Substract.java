package Factory_Method.code;

public class Substract implements Operation {
    @Override
    public int makeOperation(int a, int b) {
        return a - b;
    }
}
