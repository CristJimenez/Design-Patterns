package Abstract_Factory;

public class RealSubstract implements Real {
    @Override
    public double opReal(double a, double b) {
        return a - b;
    }
}
