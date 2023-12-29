package main.seminar2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Runner> champ = new ArrayList<>();
        Runner runner1 = new Cat("Vasya", 25, 1500);
        Runner runner2 = new Dog("Volk", 25, 1500);
        Runner runner3 = new Bird("Kesha", 150, 150);
        champ.add(runner1);champ.add(runner2);champ.add(runner3);
        List<Obstacle> obstacles = new ArrayList<>();
        Obstacle wall1 = new Wall(25);
        Obstacle wall2 = new Wall(15);
        Obstacle run1 = new Track(1200);
        Obstacle run2 = new Track(1500);
        obstacles.add(wall1);obstacles.add(wall2);obstacles.add(run1);obstacles.add(run2);

        for (Runner run : champ){
            for (Obstacle obs: obstacles){
                if(obs instanceof Wall){
                    if(!run.jump(obs.getHeight()))break;
                }
                if(obs instanceof Track){
                    if(!run.run(obs.getLength()))break;
                    }
                }
            }
        }
    }

