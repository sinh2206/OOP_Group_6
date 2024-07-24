// TeamManagement.java
import java.util.HashMap;
import java.util.Map;

public class TeamManagement {
    private Map<String, Team> teams;

    public TeamManagement() {
        this.teams = new HashMap<>();
    }
    
    public void addTeam(String teamName, Team team) {
        teams.put(teamName, team);
    }

    public void removeTeam(String teamName) {
        teams.remove(teamName);
    }

    public Team getTeam(String teamName) {
        return teams.get(teamName);
    }

    public Map<String, Team> getAllTeams() {
        return teams;
    }
}
