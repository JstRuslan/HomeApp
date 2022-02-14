package Less1;

public class Cat implements Run, Jump, Participants {
    private String name;
    private int jumpLength;
    private int runDistance;

    Cat (String name, int jumpLength, int runDistance){

        this.name = name;
        this.jumpLength = jumpLength;
        this.runDistance = runDistance;
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
                if (this.runDistance >= measureObst) {
                    run();
                    return true;
                }
                else {
                    System.out.printf("ВЫБЫЛ! %s препятствие не преодолел!\n", name);
                    return false;
                }
            case "wall" :
                if (this.jumpLength >= measureObst) {
                    jump();
                    return true;
                }
                else {
                    System.out.printf("ВЫБЫЛ! %s препятствие wall не преодолел!\n", name);
                    return false;
                }
        }

        return false;
    }
}
