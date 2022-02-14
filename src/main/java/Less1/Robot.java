package Less1;

public class Robot implements Run, Jump, Participants{
    private String name;
    private int jumpLength;
    private int runDistance;

    public Robot(String name, int jumpLength, int runDistance) {
        this.name = name;
        this.jumpLength = jumpLength;
        this.runDistance = runDistance;
    }

    public int getJumpLength() {
        return jumpLength;
    }

    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public void jump() {
        System.out.printf("%s прыгнул!\n", name);
    }

    @Override
    public void run() {
        System.out.printf("%s пробежал!\n", name);
    }

    @Override
    public boolean doIt(int measureObst, String kindObstacle) {
        switch (kindObstacle) {
            case "track" :
                if (getRunDistance() >= measureObst) {
                    run();
                    return true;
                }
                else {
                    System.out.printf("ВЫБЫЛ! %s препятствие не преодолел!\n", name);
                    return false;
                }
            case "wall" :
                if (getJumpLength() >= measureObst) {
                    jump();
                    return true;
                }
                else {
                    System.out.printf("ВЫБЫЛ! %s препятствие не преодолел!\n", name);
                    return false;
                }
        }
        return false;
    }
}
