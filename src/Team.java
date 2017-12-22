import animals.*;
/**
 * @author Anton Gil
 * @version dated Dec 22, 2017
 * @link https://github.com/goofyk/J2Lesson1Gil
 */

public class Team {

    private String nameTeam;
    private Animal[] arrTeam;
    private String ResCourse = "";

    Team(String nameTeam, Animal[] arrTeam){
        this.nameTeam = nameTeam;
        this.arrTeam = arrTeam;
    }

    public Animal[] getArrTeam() {
        return arrTeam;
    }

    public void setResultObstacle(String resultObstacle){
        ResCourse = ResCourse + "\n" + resultObstacle;
    }

    public void showResults(){
        System.out.println("Results Team \"" + this.nameTeam + "\"");
        System.out.println(ResCourse);
    }
}
