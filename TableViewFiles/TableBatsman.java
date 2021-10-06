package TableViewFiles;

public class TableBatsman {

    private String playerName;
    private String outType;
    private String batsmanRun;
    private String ballPlayed;
    private String fourRun;
    private String sixRun;
    private String strikeRate;

    public TableBatsman(String playerName, String outType, String batsmanRun, String ballPlayed, String fourRun, String sixRun, String strikeRate) {
        this.playerName = playerName;
        this.outType = outType;
        this.batsmanRun = batsmanRun;
        this.ballPlayed = ballPlayed;
        this.fourRun = fourRun;
        this.sixRun = sixRun;
        this.strikeRate = strikeRate;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getOutType() {
        return outType;
    }

    public String getBatsmanRun() {
        return batsmanRun;
    }

    public String getBallPlayed() {
        return ballPlayed;
    }

    public String getFourRun() {
        return fourRun;
    }

    public String getSixRun() {
        return sixRun;
    }

    public String getStrikeRate() {
        return strikeRate;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setOutType(String outType) {
        this.outType = outType;
    }

    public void setBatsmanRun(String batsmanRun) {
        this.batsmanRun = batsmanRun;
    }

    public void setBallPlayed(String ballPlayed) {
        this.ballPlayed = ballPlayed;
    }

    public void setFourRun(String fourRun) {
        this.fourRun = fourRun;
    }

    public void setSixRun(String sixRun) {
        this.sixRun = sixRun;
    }

    public void setStrikeRate(String strikeRate) {
        this.strikeRate = strikeRate;
    }
}
