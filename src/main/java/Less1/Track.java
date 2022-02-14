package Less1;

public class Track implements Obstacles {
    private int trackDistance;

    public Track(int trackDistance) {
        this.trackDistance = trackDistance;
    }

    @Override
    public boolean crossObstacle(Participants p) {
        return p.doIt(this.trackDistance, "track");
    }

    @Override
    public String toString() {
        return ">>> Obstacle -> Track {" + "Distance=" + trackDistance +'}';
    }
}
