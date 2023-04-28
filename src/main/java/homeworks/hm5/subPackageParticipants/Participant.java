package homeworks.hm5.subPackageParticipants;

public abstract class Participant {
    private int runningLimit;
    private int jumpingLimit;
    private String name;
    private boolean isActive;

    public Participant(String name, int runningLimit, int jumpingLimit) {
        this.runningLimit = runningLimit;
        this.jumpingLimit = jumpingLimit;
        this.name = name;
        isActive = true;
    }

    public int getRunningLimit() {
        return runningLimit;
    }

    public int getJumpingLimit() {
        return jumpingLimit;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void deactivate() {
        isActive = false;
    }

    public abstract void run();

    public abstract void jump();
}
