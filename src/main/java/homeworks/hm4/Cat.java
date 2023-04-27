package homeworks.hm4;

public class Cat extends Animal {
    private static int catCount = 0;

    public Cat() {
        super();
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance > 200 || distance <= 0) {
            throw new RuntimeException("Invalid distance for cat to run");
        } else {
            System.out.println("Cat run " + distance + " m");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println("Cat can`t swim, I`m sorry");
    }
}
