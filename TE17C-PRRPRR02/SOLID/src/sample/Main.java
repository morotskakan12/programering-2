package sample;


import animals.*;

public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black", "Its a dog!"),
                            new Hedgehog("Blue", "Sonic!!"),
                            new Duck("Yellow", "Its a Duck!"),
                            new Owl("Brown", "Papa near!!"),
                            new Snake("Black and Yellow", "Holy heck its Snek!")};

        System.out.println("###############");
        System.out.println();

        activateAnimal(animals);
    }

    private static void activateAnimal(Animal[] animals) {
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.speak();
            animal.setColor("Grey");
            animal.get_description();
            System.out.println();

            move(animal);

            System.out.println("###############");
            System.out.println();
        }
    }

    private static void move(Animal animal) {
        animal.dash();
        animal.fly();
        animal.jump();
        animal.roll();
        animal.sit();
        animal.run();
        animal.skip();
        animal.slither();
        animal.trot();
        animal.swim();
    }
}
