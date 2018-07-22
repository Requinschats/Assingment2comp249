package CentrePlayers;
import SoccerPlayer.SoccerPlayer;

import java.util.Date;

public class Defender extends SoccerPlayer {

    private double numTackles;

    public void setNumTackles(double numTackles) {
        this.numTackles = numTackles;
    }

    public double getNumTackles() {
        return numTackles;
    }

    public Defender(){super();}

    public Defender(String name, Date dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, double numTackles){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed);
        this.numTackles = numTackles;
    }
    
    public Defender(Defender a1) {
    		this.numTackles = a1.numTackles;
    }

    @Override
    public String toString() {
        return super.toString() + " The defender made " + numTackles + " tackles. ";
    }
}
