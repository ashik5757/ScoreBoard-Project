package ClassFile;


public class CurrentPlayer {

    private Batsman striker;
    private Batsman nonStriker;
    private Bowler currentBowler;


    public CurrentPlayer() {
    }

    public CurrentPlayer(Batsman striker, Batsman nonStriker, Bowler currentBowler) {
        this.striker = striker;
        this.nonStriker = nonStriker;
        this.currentBowler = currentBowler;
    }

    public Batsman getStriker() {
        return striker;
    }

    public void setStriker(Batsman striker) {
        this.striker = striker;
    }

    public Batsman getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(Batsman nonStriker) {
        this.nonStriker = nonStriker;
    }

    public Bowler getCurrentBowlers() {
        return currentBowler;
    }

    public void setCurrentBowlers(Bowler currentBowler) {
        this.currentBowler = currentBowler;
    }
}
