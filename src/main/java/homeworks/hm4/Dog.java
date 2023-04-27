package homeworks.hm4;

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog() {
        super();
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance > 500 || distance <= 0) {
            throw new RuntimeException("Invalid distance for dog to run");
        } else {
            System.out.println("Dog run " + distance + " m");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10 || distance <= 0) {
            throw new RuntimeException("Invalid distance for dog to swim");
        } else {
            System.out.println("Dog swim " + distance + " m");
        }
    }
}
