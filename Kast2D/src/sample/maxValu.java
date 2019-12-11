package sample;

import static java.lang.Math.*;

public class maxValu{

    public double calkulatXmax(double v, double a) {
        a = toRadians(a);
        return (pow(v, 2)*sin(2*a))/9.82;
    }


    public double calkulatYmax(double v, double a) {
        a = toRadians(a);
        return (pow(v,2)*pow(sin(a),2))/(2*9.82) ;
    }
}
