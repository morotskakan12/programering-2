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
class power implements calutlat{
    public double calculate(double a, double b){ return Math.pow(a, b);}
}
class prosent implements calutlat{
    public double calculate(double a, double b){
        a = a/100;
        System.out.println(a);
        return a*b ;}
}