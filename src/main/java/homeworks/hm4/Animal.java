package homeworks.hm4;

public class Animal {
    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int distance) {
        if (distance <= 0) {
            throw new RuntimeException("Invalid distance for animal to run");
        } else {
            System.out.println("Unknown animal run " + distance + " m");
        }
    }

    public void swim(int distance) {
        if (distance <= 0) {
            throw new RuntimeException("Invalid distance for animal to swim");
        } else {
            System.out.println("Unknown animal swim " + distance + " m");
        }
    }
}
