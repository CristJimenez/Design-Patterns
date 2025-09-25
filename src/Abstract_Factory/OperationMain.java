package Abstract_Factory;

public class OperationMain {

    public static void main(String[] args) {
        OperationFactory add = new AddOperationFactory();
        Integer intAdd = add.createInt();
        Real realAdd = add.createReal();
        System.out.println(intAdd.opInteger(3, 2));
        System.out.println(realAdd.opReal(3.25, 2.25));
        System.out.println("------------------------------------");
        OperationFactory substrat = new SubstractOperationFactory();
        Integer intSubstract = substrat.createInt();
        Real realSubstract = substrat.createReal();
        System.out.println(intSubstract.opInteger(3, 2));
        System.out.println(realSubstract.opReal(3, 2.5));
    }
    
}
