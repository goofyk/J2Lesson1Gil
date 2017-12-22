import animals.*;
import obstacles.*;
/**
 * Write a description of class J2Lesson1 here.
 *
 * @author Sergey Iryupin
 * @version dated Dec 19, 2017
 * @link https://github.com/
 */
public class J2Lesson1 {
    
    public static void main(String[] args) {
        Animal[] arrTeam    = {new Cat("Murzik"), new Hen("Izzy"), new Hippo("Hippopo")};
        Obstacle[] arrObstacle = {new Track(80), new Wall(3), new Water(3)};
//        Track track     = new Track(80);
//        Wall wall       = new Wall(3);
//        Water water     = new Water(3);
//
//        for (Animal animal : zoo) {
//            System.out.println(animal + " say: " + animal.voice());
//            System.out.println(" run: " + track.doIt(animal));
//            System.out.println(" jump: " + wall.doIt(animal));
//            System.out.println(" swim: " + water.doIt(animal));
//        }

        Course c = new Course(arrObstacle); // Создаем полосу препятствий
        Team team = new Team("Test", arrTeam); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты

    }
   
}