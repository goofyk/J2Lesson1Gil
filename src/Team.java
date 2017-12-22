import animals.*;
/**
 *  Добавить класс Team, который будет содержать: название команды, массив из 4х участников
 *  (т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации о членах
 *  команды прошедших дистанцию, метод вывода информации обо всех членах команды.
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
