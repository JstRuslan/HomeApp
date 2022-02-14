package Less1;

public class Wall implements Obstacles{
    private int wallHeigth;

    public Wall(int wallHeigth) {
        this.wallHeigth = wallHeigth;
    }


    @Override
    public boolean crossObstacle(Participants p) {
        return p.doIt(this.wallHeigth, "wall");
    }

    @Override
    public String toString() {
        return ">>> Obstacle -> Wall {" + "Heigth=" + wallHeigth + '}';
    }
}
