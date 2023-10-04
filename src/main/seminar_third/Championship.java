package main.seminar_third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Championship {
    public static void main(String[] args) {
        List<Obstacle> obstacleList = new ArrayList<>(Arrays.asList(new Wall(25),
                new Wall(5), new Wall(35), new Wall(45), new Track(45), new Track(125), new Track(600), new Track(1200)));
        List<Runner> runners = new ArrayList<>(Arrays.asList(new Human("Misha", 1500, 32), new Cat("Barsik", 1000, 20), new Robot("C3PO", 1200, 80)));
        System.out.println(obstacleList);

        for (Runner runner: runners) {
            for (Obstacle obstacle: obstacleList) {
                if(obstacle instanceof Wall){
                   if(!runner.jump(obstacle.getHeight())){
                       System.out.println(runner.getName() + " loose");
                       break;
                   }
                }else{
                    if(!runner.run(obstacle.getLength())){
                        System.out.println(runner.getName() + " loose");
                        break;
                    }
                }
            }
        }
    }
}
