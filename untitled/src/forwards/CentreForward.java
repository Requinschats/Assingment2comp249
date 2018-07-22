package forwards;

import java.util.Date;

public class CentreForward extends Forward {

    private int longBallsReceived;

    public void setLongBallsReceived(int longBallsReceived) {
        this.longBallsReceived = longBallsReceived;
    }

    public int getLongBallsReceived() {
        return longBallsReceived;
    }

    public CentreForward() {
        super();
    }

    public CentreForward(String name, Date dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int goalsScored, int numAssists, int shotsOnTarget, int longBallsReceived) {
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, goalsScored, numAssists, shotsOnTarget);
        this.longBallsReceived = longBallsReceived;
    }
    
    public CentreForward(CentreForward a1) {
    		this.longBallsReceived = a1.longBallsReceived;
    }

    @Override
    public String toString() {
        return super.toString() + " He also received " + longBallsReceived + "long balls.";
    }
}
