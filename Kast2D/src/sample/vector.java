package sample;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class vector extends Calkulat {
    @Override
    public double calkulatX(double v, double a, double t) {

        return  v *cos(a);
    }

    @Override
    public double calkulatY(double v, double a, double t) {
        return v * sin(a);
    }
}
