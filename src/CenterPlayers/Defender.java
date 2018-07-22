package CenterPlayers;

import java.text.SimpleDateFormat;
import java.util.Date;
import SoccerPlayer.SoccerPlayer;

public class Defender extends SoccerPlayer {

    private double numTackles;

    public void setNumTackles(double numTackles) {
        this.numTackles = numTackles;
    }

    public double getNumTackles() {
        return numTackles;
    }

    public Defender(){}

    public Defender(String name, SimpleDateFormat dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, double numTackles){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed);
        this.numTackles = numTackles;
    }

    @Override
    public String toString() {
        return super.toString() + " The defender made " + numTackles + " tackles. ";
    }
}
