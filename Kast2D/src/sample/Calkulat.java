package sample;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

abstract class Calkulat{
        private double X = 0;
        private  double Y = 0;
        private double vx = 0;
        private  double vy = 0;
        private double vTot = 0;
        private double g = 9.82;
        public Calkulat(){

        }
        public abstract double calkulatX(double v ,double a);
        public abstract double calkulatY(double v ,double a);

        public void setvTot (double impotVX) {
                vTot = impotVX;
        }
        public double getvTot (){
                return vTot;
        }
        public void setVv1x (double impotVX){
                vx =impotVX;
        }
        public double getv1x (){
                return vx;
        }
        public void setVv1y (double impotVX){
                vy =impotVX;
        }
        public double getv1y (){
                return vy;
        }
        public void setX (double impotVX){
                X =impotVX;
        }
        public double getX (){
                return X;
        }
        public void setY (double impotVy){
                Y = impotVy;
        }
        public double getY (){
                return Y;
        }

        public double getG(){return g;}

}