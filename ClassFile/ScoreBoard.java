package ClassFile;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ScoreBoard {

    private int ID;
    private int totalRun;
    private int targetRun;
    private int extraRun;
    private int fallenWickets;
    private int totalBall;
    private String totalOver;
    private int overLimit;


    private Team[] teams = new Team[2];
    private CurrentPlayer currentPlayer;
    private ArrayList<Batsman> batsmenListTeam1;
    private ArrayList<Bowler> bowlerListTeam2;

    DecimalFormat twoPoint = new DecimalFormat("#.##");


    public ScoreBoard(int ID) {
        this.ID = ID;
        this.currentPlayer = new CurrentPlayer();
        this.batsmenListTeam1 = new ArrayList<Batsman>();
        this.bowlerListTeam2 = new ArrayList<Bowler>();
    }

    public void setOverLimit(int overLimit) {
        this.overLimit = overLimit;
    }

    public void setTeams(Team team1, Team team2) {
        this.teams[0] = team1;
        this.teams[1] = team2;
    }

    public void updateBatsmenListTeam1(Player player) {
        this.batsmenListTeam1.add(new Batsman(player));
    }

    public void updateBowlersListTeam2(Player player) {
        this.bowlerListTeam2.add(new Bowler(player));
    }

    public void setScoreBoardStriker(Batsman batsman) {
        currentPlayer.setStriker(batsman);
    }

    public void setScoreBoardNonStriker(Batsman batsman) {
        currentPlayer.setNonStriker(batsman);
    }

    public void setScoreBoardBowlers(Bowler bowler) {
        currentPlayer.setCurrentBowlers(bowler);
    }

    public Batsman getScoreBoardStriker() {
        return currentPlayer.getStriker();
    }

    public Batsman getScoreBoardNonStriker() {
        return currentPlayer.getNonStriker();
    }

    public Bowler getScoreBoardBowlers() {
        return currentPlayer.getCurrentBowlers();
    }


    public void updateScore(int run) {

        if (run==4)
            currentPlayer.getStriker().scoreFour();

        else if (run==6)
            currentPlayer.getStriker().scoreSix();

        else
            currentPlayer.getStriker().setScore(run);


        currentPlayer.getCurrentBowlers().setRun(run);
        this.totalRun += run;
        this.totalBall++;
    }


    public void updateScore2(int run) {

        currentPlayer.getCurrentBowlers().setRun(run);
        currentPlayer.getStriker().setScore(run);

        this.totalRun += run;
        this.totalBall++;
    }




    public void updateExtraRun(int extraRun) {      // only update score -- Not ball

        this.totalRun += extraRun;
        this.extraRun += extraRun;
    }

    public void noBall() {

        currentPlayer.getCurrentBowlers().noBall();
        this.totalRun++;
        this.extraRun++;
        this.totalBall--;
    }

    public void wideBall() {

        currentPlayer.getCurrentBowlers().wideBall();
        this.totalRun++;
        this.extraRun++;
    }

    public void switchBatsman() {

        Batsman tempBatsman = currentPlayer.getStriker();
        currentPlayer.setStriker(currentPlayer.getNonStriker());
        currentPlayer.setNonStriker(tempBatsman);
    }

    public void maidenOver() {
        currentPlayer.getCurrentBowlers().maidenOver();
    }

    public void setScoreBoardCurrentBowler(Bowler bowler) {
        currentPlayer.setCurrentBowlers(bowler);
    }

    public void setBatsmanOut(Batsman batsman,boolean isStriker) {
        batsman.setOut(isStriker);
        //currentPlayer.getCurrentBowlers().takeWickets();
        this.fallenWickets++;
        //this.totalBall++;
    }

    public void setBatsmanOutType(String outType, Batsman batsman) {
        batsman.setOutInfo(outType, currentPlayer.getCurrentBowlers().getPlayer().getPlayerName());
        currentPlayer.getCurrentBowlers().takeWickets();
        this.totalBall++;
    }

    public void setBatsmanOutType(String outType, String outByPlayer, Batsman batsman) {
        batsman.setOutInfo(outType, currentPlayer.getCurrentBowlers().getPlayer().getPlayerName(), outByPlayer);
        if (!batsman.getOutType().equals("Run Out")) {
            currentPlayer.getCurrentBowlers().takeWickets();
            this.totalBall++;
        }
        else if (batsman.getOutType().equals("Run Out") && batsman==currentPlayer.getStriker()) {
            batsman.runOutIncreaseBallBugFix();
        }

    }


    public int getOverLimit() {
        return overLimit;
    }

    public int getID() {
        return ID;
    }

    public int getTotalRun() {
        return totalRun;
    }

    public int getTargetRun() {
        return this.totalRun+1;
    }

    public int getExtraRun() {
        return extraRun;
    }

    public int getFallenWickets() {
        return fallenWickets;
    }

    public int getTotalBall() {
        return totalBall;
    }


    public Double getCRR() {
        double crr = 0.0;
        try {
           crr = Double.parseDouble(twoPoint.format(this.totalRun/(this.totalBall/6.0)));
        } catch (NumberFormatException ignored) {
            
        }
        return crr;
    }

    public String getTotalOver() {

        if (totalBall==1)
            return "0.1";
        else if (totalBall==2)
            return "0.2";
        else if (totalBall==3)
            return "0.3";
        else if (totalBall==4)
            return "0.4";
        else if (totalBall==5)
            return "0.5";

        else {
            int over = totalBall/6;
            int remBall = totalBall%6;

            return over+"."+remBall;
        }

    }


    public Team[] getTeams() {
        return teams;
    }

    public CurrentPlayer getCurrentPlayer() {
        return currentPlayer;
    }

    public ArrayList<Batsman> getBatsmenListTeam1() {
        return batsmenListTeam1;
    }

    public ArrayList<Bowler> getBowlersListTeam2() {
        return bowlerListTeam2;
    }


}




