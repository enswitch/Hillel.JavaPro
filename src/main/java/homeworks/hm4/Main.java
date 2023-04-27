package homeworks.hm4;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Animal animal = new Animal();

        cat2.swim(5);
        cat2.run(150);

        dog1.swim(8);
        dog1.run(250);

        animal.swim(500);
        animal.run(1000);

        System.out.println("Cats created: " + Cat.getCatCount());
        System.out.println("Dogs created: " + Dog.getDogCount());
        System.out.println("Animal created: " + Animal.getAnimalCount());

    }
}
