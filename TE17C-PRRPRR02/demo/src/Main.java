public class Main {

    public static void main(String[] args) {
        Demo apa = new Demo(1);
        apa._year = 1991;

        Demo bepa = new Demo(2);
        bepa._year = 2000;

        Demo cepa = new Demo(3);
        cepa._year = 1984;

        apa.doExplicitStuff();
        bepa.doExplicitStuff();
        cepa.doExplicitStuff();

        apa.set_storage(6);

        apa.doExplicitStuff();
    }

    private static void switchThis(String s) {
        switch (s){
            case "":
                System.out.println("Tomte");
                break;
            case "hej":
                System.out.println("IT'S ALIVE!");
                break;
            default:
                System.out.println("rick rolled!");
                break;
        }
    }


}
