package ClassFile;


import java.text.DecimalFormat;

public class Batsman {

    private int run;
    private int ballPlayed;
    private int four;
    private int six;
    private double strikeRate;
    private boolean isOut;
    private String outType;
    private String outByBowler;
    private String outByPlayer;
    private Player player;
    DecimalFormat twoPoint = new DecimalFormat("#.##");

    public Batsman() {

    }

    public Batsman(Player player) {
        this.player = player;
    }

    public void setBatsman(Player player) {
        this.player = player;
    }

    public void setScore(int newRun) {
        this.run += newRun;
        this.increaseBall();
    }

    public void scoreFour() {
        this.run += 4;
        this.four++;
        this.increaseBall();
    }

    public void scoreSix() {
        this.run += 6;
        this.six++;
        this.increaseBall();
    }

    private void increaseBall() {
        this.ballPlayed++;
        this.strikeRate = Double.parseDouble(twoPoint.format(((double) this.run/this.ballPlayed) * 100));
    }

    public void runOutIncreaseBallBugFix() {
        this.ballPlayed--;
        this.strikeRate = Double.parseDouble(twoPoint.format(((double) this.run/this.ballPlayed) * 100));
    }


    public void setOut(boolean isStriker) {
        this.isOut = true;
        if (isStriker)
            this.increaseBall();
    }


    public void setOutInfo(String outType, String outByBowler) {
        this.outType = outType;
        this.outByBowler = outByBowler;
    }


    public void setOutInfo(String outType, String outByBowler, String outByPlayer) {
        this.outType = outType;
        this.outByBowler = outByBowler;
        this.outByPlayer = outByPlayer;
    }


    public String outInfo() {
        if (!this.isOut)
            return "Not Out";
        else {
            if (this.outType.equals("Bowled Out"))
                return "b " + this.outByBowler;
            else if (this.outType.equals("LBW"))
                return "lbW b " + this.outByBowler;
            else if (this.outType.equals("Catch Out"))
                return "c " + this.outByPlayer + " b " + this.outByBowler;
            else if (this.outType.equals("Run Out"))
                return "run out (" + this.outByPlayer + ")";
            else if (this.outType.equals("Stamp"))
                return "st " + this.outByPlayer + " b " + this.outByBowler;
            else
                return "Invalid";
        }

    }


    public int getRun() {
        return run;
    }

    public int getBallPlayed() {
        return ballPlayed;
    }

    public int getFour() {
        return four;
    }

    public int getSix() {
        return six;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public boolean isOut() {
        return isOut;
    }

    public String getOutType() {
        return outType;
    }

    public String getOutByBowler() {
        return outByBowler;
    }

    public String getOutByPlayer() {
        return outByPlayer;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "Batsman{" +
                "name=" + this.player.getPlayerName() +
                ", teamName=" + this.player.getTeamName() +
                ", run=" + run +
                ", ballPlayed=" + ballPlayed +
                ", four=" + four +
                ", six=" + six +
                ", strikeRate=" + strikeRate +
                ", isOut=" + isOut +
                ", outType='" + outType + '\'' +
                ", outByBowler='" + outByBowler + '\'' +
                ", outByPlayer='" + outByPlayer + '\'' +
                '}';
    }
}
