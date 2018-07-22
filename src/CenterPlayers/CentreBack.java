package CenterPlayers;

import CenterPlayers.Defender;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CentreBack extends Defender {

    private int shotsBlocked;

    public void setShotsBlocked(int shotsBlocked) {
        this.shotsBlocked = shotsBlocked;
    }

    public int getShotsBlocked() {
        return shotsBlocked;
    }

    public CentreBack(){
        super();
    }
    public CentreBack(String name, SimpleDateFormat dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, double numTackles, int shotsBlocked){

        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, numTackles);
        this.shotsBlocked = shotsBlocked;
    }

    @Override
    public String toString() {
        return super.toString() + " The player also blocked " + shotsBlocked + " shots.";
    }
}
