package Abstract_Factory;

public class AddOperationFactory implements OperationFactory {
    @Override
    public Integer createInt() {
        return new IntAdd();
    }
    
    public Real createReal() {
        return new RealAdd();
    }
}
