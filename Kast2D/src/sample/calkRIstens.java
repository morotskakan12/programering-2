package sample;

import javafx.scene.layout.Pane;

import static java.lang.Math.*;


public class calkRIstens {

    public static Pane main(Pane windo, double v0, double a){
        graphics gp = new graphics();

        double v0x = v0*Math.cos(a);
        double v0y = v0*Math.sin(a);
        double a0x = -FRec()*v0*v0x;
        double X=0.0;
        double Y= 0.0;
        double a0y = -9.82-(FRec()*v0*v0y);
        /*double k = 0.45*PI*pow(5,2);
        double fD = -k*(pow(v0,2));
        double v0x = v0*Math.cos(a);
        double v0y = v0*Math.sin(a);
        double X=0.0;
        double Y= 0.0;*/
        for(double t = 0.01; t < 100; t = t + 0.01) {


          /*  X = X + (v0x * 1);

            Y = Y + (v0y * 1);
            windo = gp.drawBow(windo,X,Y);
            fD = (-k*((pow(v0x,2))+(pow(v0y,2))));
            a = atan(v0y/v0x);
            double fDX= (fD*cos(a));
            double fDY=(fD*sin(a));
            double fx =0 + fDX;
            double fy =(-5*9.82) +fDY;
            double aX = fx/5;
            double aY = fy/5;
            v0x = 1*aX;
            v0y = 1*aY;*/
            if (Y<0){
                System.out.println(X);
                System.out.println(Y);
                return windo;
            }
            X = X + (v0x * 0.1);

            Y = Y + (v0y * 0.1);
            windo = gp.drawBowRed(windo,X,Y);
             v0x = v0x + (a0x * 0.1);
            v0y = v0y + (a0y * 0.1);
            v0 = Math.sqrt((pow(v0x, 2)) + (pow(v0y, 2)));
            a0x = -FRec() * v0 * v0x;

            a0y = -9.82 - (FRec() * v0 * v0y);

        }
        return windo;
    }
    public static double FRec(){
        double C = 0.45;
        double P = 1.2041;

        double A = PI*pow(1.91,2);
        double M = 2.58;

        return (((C*P*A)/(2*M)))*0.1;
    }

    }

