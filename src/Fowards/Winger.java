package Fowards;

import Fowards.Foward;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Winger extends Foward {

    private int numCrosses;

    public void setNumCrosses(int numCrosses) {
        this.numCrosses = numCrosses;
    }

    public int getNumCrosses() {
        return numCrosses;
    }

    public Winger(){
        super();
    }
    public Winger(String name, SimpleDateFormat dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int goalsScored, int numAssists, int shotsOnTarget, int numCrosses){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, goalsScored, numAssists, shotsOnTarget);
        this.numCrosses = numCrosses;
    }

    @Override
    public String toString() {
        return super.toString() + " He also made " + numCrosses + " crosses.";
    }
}
