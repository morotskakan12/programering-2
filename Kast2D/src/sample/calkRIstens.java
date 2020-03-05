package sample;

import javafx.scene.layout.Pane;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


public class calkRIstens {

    public static Pane main(Pane windo, double v0, double a){
        graphics gp = new graphics();
        double V0x = v0*Math.cos(a); double V0y = v0*Math.sin(a);
        double a0x = -FRec()*v0*V0x;double a0y = -9.82-(FRec()*v0*V0y);

        double X=0.0;
        double Y= 0.0;
        for(double t = 0.01; t < 100; t = t + 0.01) {

            if (Y < 0.0){
                return windo;
            }
            X = X + (V0x * 0.01);

            Y = Y + (V0y * 0.01);


            windo = gp.drawBow(windo,X,Y);
            V0x = V0x + (a0x * 0.01);
            V0y = V0y + (a0y * 0.01);
            v0 = Math.sqrt((pow(V0x, 2)) + (pow(V0y, 2)));
            a0x = -FRec() * v0 * V0x;
            System.out.println(a0x);
            a0y = -9.82 - (FRec() * v0 * V0y);
            System.out.println(a0y);
        }
        return windo;
    }
    public static double FRec(){
        double C = 0.15;
        double P = 1.2041;
        double A = PI*pow(5,2);
        double M = 5;
        System.out.println((C*P*A)/(2*M));
        return ((C*P*A)/(2*M));
    }

    }

