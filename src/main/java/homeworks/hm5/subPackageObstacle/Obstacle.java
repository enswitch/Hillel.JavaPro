package homeworks.hm5.subPackageObstacle;

import homeworks.hm5.subPackageParticipants.Participant;

public abstract class Obstacle {
    private int obstacleDistance;
    private String obstacleName;

    public Obstacle(String obstacleName, int obstacleDistance) {
        this.obstacleDistance = obstacleDistance;
        this.obstacleName = obstacleName;
    }

    public int getObstacleDistance() {
        return obstacleDistance;
    }

    public String getObstacleName() {
        return obstacleName;
    }

    public void setObstacleDistance(int obstacleDistance) {
        if (obstacleDistance <= 0) {
            throw new RuntimeException("Invalid running track length");
        } else {
            this.obstacleDistance = obstacleDistance;
        }
    }

    public abstract void overcome(Participant participant);
}
