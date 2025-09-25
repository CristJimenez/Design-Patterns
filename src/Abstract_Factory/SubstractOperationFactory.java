package Abstract_Factory;

public class SubstractOperationFactory implements OperationFactory {
    @Override
    public Integer createInt() {
        return new IntSubstract();
    }
    
    @Override
    public Real createReal() {
        return new RealSubstract();
    }
}
