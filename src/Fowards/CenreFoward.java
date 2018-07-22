package Fowards;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CenreFoward extends Foward {

    private int longBallsReceived;

    public void setLongBallsReceived(int longBallsReceived) {
        this.longBallsReceived = longBallsReceived;
    }

    public int getLongBallsReceived() {
        return longBallsReceived;
    }

    public CenreFoward() {
        super();
    }

    public CenreFoward(String name, SimpleDateFormat dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int goalsScored, int numAssists, int shotsOnTarget, int longBallsReceived) {
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, goalsScored, numAssists, shotsOnTarget);
        this.longBallsReceived = longBallsReceived;
    }

    @Override
    public String toString() {
        return super.toString() + " He also received " + longBallsReceived + "long balls.";
    }
}
