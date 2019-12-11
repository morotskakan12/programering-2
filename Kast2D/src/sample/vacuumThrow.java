package sample;

import static java.lang.Math.*;

public class vacuumThrow extends Calkulat {
    public vacuumThrow(double zoom) {
        super(zoom);
    }

    @Override
    public double calkulatX(double v, double a, double t) {
        return (v * cos(a) * t);
    }

    @Override
    public double calkulatY(double v, double a, double t) {
        return ((v * sin(a) * t) - ((getG() * (pow(t, 2))) / 2));
    }


}
