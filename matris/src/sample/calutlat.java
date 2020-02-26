package sample;

public interface calutlat {
    double calculate(double a, double b);
}

 class addeton implements calutlat {

    public double calculate(double a, double b) {
        return a + b;
    }
}

class subtraktion implements calutlat{

    public double calculate(double a, double b) {
        return a - b;
    }
}
class multiplikation implements calutlat{
    public double calculate(double a, double b){
        return a*b;
    }
}
class division implements calutlat{
    public double calculate(double a, double b){
        return a/b;
    }
}
class power implements calutlat{
    public double calculate(double a, double b){
        return Math.pow(a, b);
    }
}
class prosent implements calutlat{
    public double calculate(double a, double b){
        a = a/100;
        return a*b ;
    }
}