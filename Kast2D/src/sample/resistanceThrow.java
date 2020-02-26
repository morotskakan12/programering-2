package sample;
import java.time.Duration;

import static java.lang.Math.*;


public class resistanceThrow extends Calkulat{


    accelerationResistance ac = new accelerationResistance();

    public double calkulatX1(double v0x, double a, double t) {


        double x = getX() + (v0x*t);
        setX(x);
        return x;
    }


    public double calkulatY1(double v0y, double a, double t) {
        double y = getY() + (v0y *t);
        setY(y);
        return y;
    }

    @Override
    public double calkulatX(double v, double a) {
        return 0;
    }

    @Override
    public double calkulatY(double v, double a) {
        return 0;
    }
}
