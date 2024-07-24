import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Robot> robots;

    public Team(String name) {
        this.name = name;
        this.robots = new ArrayList<>();
    }

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

    public void removeRobot(Robot robot) {
        robots.remove(robot);
    }

    public List<Robot> getRobots() {
        return robots;
    }

    public String getName() {
        return name;
    }

    public static void displayWelcomeMessage(Team team) {
        System.out.println("***************WELCOME TO***************");
        System.out.println("****************" + team.getName().toUpperCase() + "*****************");
    }
}