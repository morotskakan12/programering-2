public class cerDisplay {
    public static void main(String[] args) {
        Car Carryera = new porsche(new String("4"));
        Car Enzo = new ferrari(new String("4"));
        Car Benz = new mercedes(new String("2"));
        Carryera.setEngine(new v6());
        Enzo.setEngine(new v8());
        Benz.setEngine(new v8());
        String porscheDisplay[] = {Carryera.collerOfCar(),Carryera.Numberplet(),Carryera.tryEngine(),Carryera.yerOfMaking(),Carryera.carSund()};
        String ferrariDisplay[] = {Enzo.collerOfCar(),Enzo.Numberplet(),Enzo.tryEngine(),Enzo.yerOfMaking(),Enzo.carSund()};
        String mercedesDisplay[] = {Benz.collerOfCar(),Benz.Numberplet(),Benz.tryEngine(),Benz.yerOfMaking(),Benz.carSund()};
        String cerDisplay [][] = {porscheDisplay,ferrariDisplay,mercedesDisplay};
    }
}
