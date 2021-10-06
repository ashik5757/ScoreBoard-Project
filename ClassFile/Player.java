package ClassFile;


public class Player {

    private String playerName;
    private Team team;

    Player() {

    }

    public Player(String playerName, Team team) {
        this.playerName = playerName;
        this.team = team;
    }



    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeamName() {
        return team.getName();
    }

}
