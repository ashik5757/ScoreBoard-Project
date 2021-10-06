package ClassFile;


import java.text.DecimalFormat;

public class Bowler {

    private int ball;
    private int run;
    private String over;
    private int maidenOver;
    private int wickets;
    private int wideBall;
    private int noBall;
    private double economy;
    private Player player;
    DecimalFormat twoPoint = new DecimalFormat("#.##");

    public Bowler() {
    }

    public Bowler(Player player) {
        this.player = player;
    }

    public void setBowlers(Player player) {
        this.player = player;
    }

    private void increaseBall() {
        this.ball++;
        this.economy = Double.parseDouble(twoPoint.format(this.run/(this.ball/6.0)));
    }

    private void decreaseBall() {
        this.ball--;
    }

    public void setRun(int run) {
        this.run += run;
        this.increaseBall();
    }

    public void noBall() {
        this.noBall++;
        this.run++;
        this.ball--;
        //this.decreaseBall();

        try {
            this.economy = Double.parseDouble(twoPoint.format(this.run/(this.ball/6.0)));
        } catch (NumberFormatException ignored) {

        }

    }

    public void wideBall() {
        this.wideBall++;
        this.run++;
        try {
            this.economy = Double.parseDouble(twoPoint.format(this.run/(this.ball/6.0)));
        } catch (NumberFormatException ignored) {

        }

    }


    public void maidenOver() {
        this.maidenOver++;
    }

    public void takeWickets() {
        this.wickets++;
        this.increaseBall();
    }

    //getters
    public int getBall() {
        return ball;
    }

    public int getRun() {
        return run;
    }

    public int getMaidenOver() {
        return maidenOver;
    }

    public int getWickets() {
        return wickets;
    }

    public int getWideBall() {
        return wideBall;
    }

    public int getNoBall() {
        return noBall;
    }

    public double getEconomy() {
        return economy;
    }

    public Player getPlayer() {
        return player;
    }

    public String getOver() {

        if (ball==1)
            return "0.1";
        else if (ball==2)
            return "0.2";
        else if (ball==3)
            return "0.3";
        else if (ball==4)
            return "0.4";
        else if (ball==5)
            return "0.5";

        else {
            int over = ball/6;
            int remBall = ball%6;

            return over+"."+remBall;
        }
    }

    @Override
    public String toString() {
        return "Bowler{" +
                "name=" + this.player.getPlayerName() +
                ", teamName=" + this.player.getTeamName() +
                ", ball=" + ball +
                ", run=" + run +
                ", maidenOver=" + maidenOver +
                ", wickets=" + wickets +
                ", wideBall=" + wideBall +
                ", noBall=" + noBall +
                ", economy=" + economy +
                '}';
    }
}
