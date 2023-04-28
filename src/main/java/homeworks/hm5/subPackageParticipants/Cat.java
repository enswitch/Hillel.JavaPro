package homeworks.hm5.subPackageParticipants;

public class Cat extends Participant {
    public Cat(String name, int runningLimit, int jumpingLimit) {
        super(name, runningLimit, jumpingLimit);
    }

    @Override
    public void run() {
        System.out.println("Cat is running...");
    }

    @Override
    public void jump() {
        System.out.println("Cat is jumping...");
    }
}
