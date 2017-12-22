import obstacles.*;
import animals.*;
/**
 * Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий,
 * метод который будет просить команду пройти всю полосу
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
