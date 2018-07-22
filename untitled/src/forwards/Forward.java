package forwards;

import SoccerPlayer.SoccerPlayer;

import java.util.Date;

public class Forward extends SoccerPlayer {

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

    public Forward(){
        super();
    }
    
    public Forward(String name, Date dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int goalsScored, int numAssists, int shotsOnTarget){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed);
        this.goalsScored = goalsScored;
        this.numAssists = numAssists;
        this.shotsOnTarget = shotsOnTarget;
    }
    
    public Forward(Forward a1) {
    		this.goalsScored = a1.goalsScored;
    		this.numAssists = a1.numAssists;
    		this.shotsOnTarget = a1.shotsOnTarget;
    }

    @Override
    public String toString() {
        return super.toString() + "The foward scored " + goalsScored + " goals on a total of " + shotsOnTarget+ " shots on target. The player made " + numAssists + " assists.";
    }
}
