public class cerDisplay {



    public static void main(String[] args) {
        car Carryera = new porsche();
        car Enzo = new ferrari();
        car Benz = new mercedes();
        Carryera.setEngine(new v6());
        Enzo.setEngine(new v8());
        Benz.setEngine(new v8());
        String porscheDisplay[] ={Carryera.collerOfCar(),Carryera.Numberplet(),Carryera.tryEngine(),Carryera.carSund()};
        String ferrariDisplay[] ={Enzo.collerOfCar(),Enzo.Numberplet(),Enzo.tryEngine(),Enzo.carSund()};
        String mercedesDisplay[] ={Benz.collerOfCar(),Benz.Numberplet(),Benz.tryEngine(),Benz.carSund()};
        String cerDisplay [][] ={porscheDisplay,ferrariDisplay,mercedesDisplay};
    }
}
