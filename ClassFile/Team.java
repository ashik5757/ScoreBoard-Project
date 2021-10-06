package ClassFile;

import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> playersList;

    public Team() {
        this.playersList = new ArrayList<Player>();
    }

    public Team(String name) {
        this.name = name;
        this.playersList = new ArrayList<Player>();
    }

    public Team(String name, ArrayList<Player> playersList) {
        this.name = name;
        this.playersList = playersList;
    }

    public void addPlayer(Player player) {
        playersList.add(player);
    }

//
//    public void removePlayer(String playerName) {
//        for (Player player : playersList) {
//            if (player.getPlayerName().equals(playerName)) {
//                playersList.remove(player);
//            }
//
//        }
//    }


   

    public ArrayList<Player> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(ArrayList<Player> playersList) {
        this.playersList = playersList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
