package homeworks.hm5.subPackageObstacle;

import homeworks.hm5.subPackageParticipants.Participant;

public class RunningTrack extends Obstacle {

    public RunningTrack(String obstacleName, int obstacleDistance) {
        super(obstacleName, obstacleDistance);
    }

    @Override
    public void overcome(Participant participant) {
        participant.run();
        if (participant.isActive() && participant.getRunningLimit() < getObstacleDistance()) {
            participant.deactivate();
        }
    }
}
