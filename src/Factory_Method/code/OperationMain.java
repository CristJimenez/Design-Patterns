package Factory_Method.code;

public class OperationMain {

    public static void main(String[] args) {
        OperationFactory factory = new OperationFactory();
        Operation add = factory.createOperation(Type.ADD);
        Operation substract = factory.createOperation(Type.SUBSTRACT);
        System.out.println(add.makeOperation(3, 2));
        System.out.println(substract.makeOperation(3, 2));
    }
    
}
