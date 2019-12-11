package sample;

abstract class Calkulat{
    private double zoom;
        private double g = 9.82;
        public Calkulat(double zoom){
            zoom = zoom;
        }
        public abstract double calkulatX(double v ,double a, double t);
        public abstract double calkulatY(double v ,double a, double t);
        public void setZoom(double zoom){
            zoom = zoom;
        }
        public double getG(){return g;}
        public double getZoom(){
            return zoom;
        }
}
