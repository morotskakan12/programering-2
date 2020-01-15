package sample;

abstract class Calkulat{

        private double g = 9.82;
        public Calkulat(){

        }
        public abstract double calkulatX(double v ,double a, double t);
        public abstract double calkulatY(double v ,double a, double t);

        public double getG(){return g;}

}
