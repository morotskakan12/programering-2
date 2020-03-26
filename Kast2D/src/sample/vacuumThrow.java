package sample;

import javafx.scene.layout.Pane;

import static java.lang.Math.*;

public class vacuumThrow {


    public vacuumThrow() {

    }

    public Pane calkulatX(Pane windo, double v, double a) {
        vector vector = new vector();
        graphics gp = new graphics();
        double Y = 0;
        double X = 0;
        double t = 0.01;


        do{ Y = (v * sin(a) * t) - ((9.82* (pow(t, 2))) / 2);
            X = (v* cos(a)* t);
            gp.drawBowBlue(windo,X,Y);
               t = t + 0.001;
        }while ((Y>0)&&(X<12500));
        return windo;
    }


    public double calkulatY(double v, double a, double t) {
        vector vector = new vector();
        return (v * sin(a) * t) - ((9.82* (pow(t, 2))) / 2);

    }


}
