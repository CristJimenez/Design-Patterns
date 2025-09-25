package Factory_Method;

public class OperationFactory {
    public Operation createOperation(Type type) {
        switch(type) {
            case ADD:
                return new Add();
            case SUBSTRACT:
                return new Substract();
            default:
                return null;
        }
    }
}
