package sample;

import static java.lang.Math.*;

public class vacuumThrow {


    public vacuumThrow() {

    }

    public double calkulatX(double v, double a, double t) {
        vector vector = new vector();
        return (v* cos(a)* t);
    }


    public double calkulatY(double v, double a, double t) {
        vector vector = new vector();
        return (v * sin(a) * t) - ((9.82* (pow(t, 2))) / 2);

    }


}
