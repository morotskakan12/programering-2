public class cerDisplay {
    public static void main(String[] args) {
        Car Carryera = new porsche(new String("4"));
        Car Enzo = new ferrari(new String("4"));
        Car Benz = new mercedes(new String("2"));
        Carryera.setEngine(new v6());
        Enzo.setEngine(new v8());
        Benz.setEngine(new v8());
        Car carDisplay [] = {Carryera,Enzo,Benz};
        for(Car car: carDisplay){
            System.out.println("");
            System.out.println(car);
            System.out.println("it was built "+car.yerOfMaking());
            System.out.println("the coller is "+car.collerOfCar());
            System.out.println("number of doors "+car.getDors());
            System.out.println("the numberplet is " + car.numberplet());
            System.out.println("the engine is "+car.tryEngine());
            System.out.println("the car gos "+car.carSund());
            System.out.println("-----------------");


        }

    }
}
