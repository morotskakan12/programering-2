public class oporaton {
    private calutlat calutlat;

    public oporaton(calutlat strategy){
        this.calutlat = strategy;
    }

    public double executeOporaton(double num1, double num2){
        return calutlat.calculate(num1, num2);

    }

}
