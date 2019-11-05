public interface calutlat {
    double calculate(double a, double b);

}

class addeton implements calutlat {

    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}

class subtraktion implements calutlat{

    @Override
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