package homeworks.hm5.subPackageParticipants;

public class Robot extends Participant {
    public Robot(String name, int runningLimit, int jumpingLimit) {
        super(name, runningLimit, jumpingLimit);
    }

    @Override
    public void run() {
        System.out.println("Robot is running...");
    }

    @Override
    public void jump() {
        System.out.println("Robot is jumping...");
    }
}
