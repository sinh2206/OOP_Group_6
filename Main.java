public class Main {
    public static void main(String[] args) {
        TeamManagement teamManagement = new TeamManagement();

        Team teamA = new Team("Alpha");
        Team teamB = new Team("Beta");

        Robot treeFarmingRobot = new TreeFarmingRobot("001", "TreeBot");
        Robot fishFarmingRobot = new FishFarmingRobot("002", "FishBot");
        Robot doctorRobot = new DoctorRobot("003", "DocBot");
        Robot nurseRobot = new NurseRobot("004", "NurseBot");

        teamA.addRobot(treeFarmingRobot);
        teamA.addRobot(doctorRobot);

        teamB.addRobot(fishFarmingRobot);
        teamB.addRobot(nurseRobot);

        teamManagement.addTeam("Alpha", teamA);
        teamManagement.addTeam("Beta", teamB);

        WelcomeScreen.displayWelcomeMessage(teamA);
        WelcomeScreen.displayWelcomeMessage(teamB);

        for (Robot robot : teamManagement.getTeam("Alpha").getRobots()) {
            System.out.println(robot.getName() + " is in team Alpha.");
        }

        for (Robot robot : teamManagement.getTeam("Beta").getRobots()) {
            System.out.println(robot.getName() + " is in team Beta.");
        }
    }
}