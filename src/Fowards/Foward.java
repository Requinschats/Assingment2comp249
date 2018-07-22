package Fowards;

import SoccerPlayer.SoccerPlayer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Foward extends SoccerPlayer {

    private int goalsScored;
    private int numAssists;
    private int shotsOnTarget;

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public void setNumAssists(int numAssists) {
        this.numAssists = numAssists;
    }

    public void setShotsOnTarget(int shotsOnTarget) {
        this.shotsOnTarget = shotsOnTarget;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getNumAssists() {
        return numAssists;
    }

    public int getShotsOnTarget() {
        return shotsOnTarget;
    }

    public Foward(){
        super();
    }
    public Foward(String name, SimpleDateFormat dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int goalsScored, int numAssists, int shotsOnTarget){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed);
        this.goalsScored = goalsScored;
        this.numAssists = numAssists;
        this.shotsOnTarget = shotsOnTarget;
    }

    @Override
    public String toString() {
        return super.toString() + "The foward scored " + goalsScored + " goals on a total of " + shotsOnTarget+ " shots on target. The player made " + numAssists + " assists.";
    }
}
