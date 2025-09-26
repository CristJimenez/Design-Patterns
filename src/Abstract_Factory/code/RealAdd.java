package Abstract_Factory.code;

public class RealAdd implements Real {
    @Override
    public double opReal(double a, double b) {
        return a + b;
    }
}
