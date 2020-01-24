package sample;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class accelerationResistance extends Calkulat {
    private double fAre(){
        double C = 0.15;
        double P = 1.2041;
        double A = PI*pow(5,2);
        double M = 5;
        return ((C*P*A)/2*M);
    }

    @Override
    public double calkulatX(double v, double a, double t) {

        //-fAre()*v*vX;
        return 0;
    }

    @Override
    public double calkulatY(double v, double a, double t) {
        //double aY  =-getG()-fAre()*v*vY;
        return 0;
    }
}
