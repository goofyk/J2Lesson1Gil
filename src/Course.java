import obstacles.*;
import animals.*;
/**
 * @author Anton Gil
 * @version dated Dec 22, 2017
 * @link https://github.com/goofyk/J2Lesson1Gil
 */

public class Course{

    Obstacle[] obstacles;

    Course(Obstacle[] obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){

        Animal[] arrAnimals = team.getArrTeam();

        for (Animal elAnimal : arrAnimals) {

            for (Obstacle elObstacle : obstacles) {

                if (elObstacle instanceof Track){
                    team.setResultObstacle("" + elAnimal + " obstacle Track: " + ((Track) elObstacle).doIt(elAnimal));
                }else if (elObstacle instanceof Wall) {
                    team.setResultObstacle("" + elAnimal + " obstacle Wall: " + ((Wall) elObstacle).doIt(elAnimal));
                }else if (elObstacle instanceof Water) {
                    team.setResultObstacle("" + elAnimal + " obstacle Water: " + ((Water) elObstacle).doIt(elAnimal));
                };

            }

        }

    }

}
