package TableViewFiles;

public class TableBowler {

    private String bowlerName;
    private String bowlerOver;
    private String maidenOver;
    private String runGiven;
    private String wicketTaken;
    private String wideBall;
    private String noBall;
    private String economy;

    public TableBowler(String bowlerName, String bowlerOver, String maidenOver, String runGiven, String wicketTaken, String wideBall, String noBall, String economy) {
        this.bowlerName = bowlerName;
        this.bowlerOver = bowlerOver;
        this.maidenOver = maidenOver;
        this.runGiven = runGiven;
        this.wicketTaken = wicketTaken;
        this.wideBall = wideBall;
        this.noBall = noBall;
        this.economy = economy;
    }

    public String getBowlerName() {
        return bowlerName;
    }

    public void setBowlerName(String bowlerName) {
        this.bowlerName = bowlerName;
    }

    public String getBowlerOver() {
        return bowlerOver;
    }

    public void setBowlerOver(String bowlerOver) {
        this.bowlerOver = bowlerOver;
    }

    public String getMaidenOver() {
        return maidenOver;
    }

    public void setMaidenOver(String maidenOver) {
        this.maidenOver = maidenOver;
    }

    public String getRunGiven() {
        return runGiven;
    }

    public void setRunGiven(String runGiven) {
        this.runGiven = runGiven;
    }

    public String getWicketTaken() {
        return wicketTaken;
    }

    public void setWicketTaken(String wicketTaken) {
        this.wicketTaken = wicketTaken;
    }

    public String getWideBall() {
        return wideBall;
    }

    public void setWideBall(String wideBall) {
        this.wideBall = wideBall;
    }

    public String getNoBall() {
        return noBall;
    }

    public void setNoBall(String noBall) {
        this.noBall = noBall;
    }

    public String getEconomy() {
        return economy;
    }

    public void setEconomy(String economy) {
        this.economy = economy;
    }
}
