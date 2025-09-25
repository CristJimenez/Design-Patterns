package Abstract_Factory;

public class RealAdd implements Real {
    @Override
    public double opReal(double a, double b) {
        return a + b;
    }
}
