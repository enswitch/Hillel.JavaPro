package homeworks.hm5.subPackageParticipants;

public class Human extends Participant {

    public Human(String name, int runningLimit, int jumpingLimit) {
        super(name, runningLimit, jumpingLimit);
    }

    @Override
    public void run() {
        System.out.println("Human is running...");
    }

    @Override
    public void jump() {
        System.out.println("Human is jumping...");
    }
}
