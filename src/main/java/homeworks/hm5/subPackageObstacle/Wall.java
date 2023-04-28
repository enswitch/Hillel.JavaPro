package homeworks.hm5.subPackageObstacle;

import homeworks.hm5.subPackageParticipants.Participant;

public class Wall extends Obstacle {
    public Wall(String obstacleName, int obstacleDistance) {
        super(obstacleName, obstacleDistance);
    }

    @Override
    public void overcome(Participant participant) {
        participant.jump();
        if (participant.isActive() && participant.getJumpingLimit() < getObstacleDistance()) {
            participant.deactivate();
        }
    }
}
