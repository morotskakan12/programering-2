abstract  class Car {
    private String _NumberOfDors;
    public Car (String number){

        _NumberOfDors = number;

    }
    public String getDors(){

        return _NumberOfDors;
    }

    public abstract String collerOfCar();
    public abstract String Numberplet();
    public abstract String yerOfMaking();
    public whtEngine engine;
    public String carSund(){
        return "BrumBrum";
    }

    public String tryEngine(){
        return engine.engine();
    }
    public void setEngine(whtEngine newEngine ){
        engine = newEngine;
    }
}


