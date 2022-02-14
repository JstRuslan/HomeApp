package Less1;

public class HWork1  {
    public static void main (String[] args){
        Cat cat1 = new Cat("Мурзик", 2, 500);
        Cat cat2 = new Cat("Тузик", 3, 450);
        Robot robot1 = new Robot("1001101", 6, 1900);
        Human human1 = new Human("Борис", 2, 1800);

        Track tr1 = new Track(480);
        Wall wl1 = new Wall(2);
        Wall wl2 = new Wall(1);

        Obstacles[] obstacles = {tr1, wl1, wl2};
        Participants[] participants = {cat1, cat2, robot1, human1};
        for (int i=0; i< obstacles.length; i++) {
            System.out.println(obstacles[i].toString());
            for (int j=0; j < participants.length; j++) {
                boolean result = true;
                if (participants[j] != null)
                    result = obstacles[i].crossObstacle(participants[j]);
                if (result == false)
                    participants[j] = null;
                 }
             };

    }
}
