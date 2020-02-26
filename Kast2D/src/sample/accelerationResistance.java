package sample;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class accelerationResistance{
    public static double fAre(){
        double C = 0.15;
        double P = 1.2041;
        double A = PI*pow(5,2);
        double M = 5;
        return ((C*P*A)/2*M);
    }


    public static double calkulatX(double v, double v0x) {
        return -fAre()*v*v0x;
    }


    public static double calkulatY(double v, double v0y) {

        return -9.82-(fAre()*v*v0y);
    }
}
