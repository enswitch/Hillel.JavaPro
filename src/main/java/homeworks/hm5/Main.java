package homeworks.hm5;

import homeworks.hm5.subPackageObstacle.Obstacle;
import homeworks.hm5.subPackageObstacle.RunningTrack;
import homeworks.hm5.subPackageObstacle.Wall;
import homeworks.hm5.subPackageParticipants.Cat;
import homeworks.hm5.subPackageParticipants.Human;
import homeworks.hm5.subPackageParticipants.Participant;
import homeworks.hm5.subPackageParticipants.Robot;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Human", 5000, 3);
        Cat cat = new Cat("Cat", 2000, 5);
        Robot robot = new Robot("Robot", 8000, 1);

        RunningTrack runningTrack = new RunningTrack("Running Track", 7000);
        Wall wall = new Wall("Wall", 4);

        Participant[] participants = {human, cat, robot};
        Obstacle[] obstacles = {runningTrack, wall};

        for (Participant p : participants) {
            boolean disqualified = false;
            for (Obstacle o : obstacles) {
                if (disqualified) {
                    break;
                }
                o.overcome(p);
                if (!p.isActive()) {
                    disqualified = true;
                    String fail = p.getName() + " failed to reach the " + o.getObstacleName();
                    fail += " on " + o.getObstacleDistance() + " meters.";
                    if (o.getObstacleDistance() == 4) {
                        fail += p.getName() + " reached just " + p.getJumpingLimit() + " meters and become disqualified";
                    } else {
                        fail += p.getName() + " reached just " + p.getRunningLimit() + " meters and become disqualified";
                    }
                    System.out.println(fail);
                } else {
                    String success = p.getName() + " reach the " + o.getObstacleName();
                    success += " with obstacle distance " + o.getObstacleDistance() + " meters!";
                    System.out.println(success);
                }
            }
        }
    }
}
