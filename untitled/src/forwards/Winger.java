package forwards;

import forwards.Forward;

import java.util.Date;

public class Winger extends Forward {

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
    
    public Winger(String name, Date dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int goalsScored, int numAssists, int shotsOnTarget, int numCrosses){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, goalsScored, numAssists, shotsOnTarget);
        this.numCrosses = numCrosses;
    }
    
    public Winger(Winger a1) {
    		this.numCrosses = a1.numCrosses;
    }

    @Override
    public String toString() {
        return super.toString() + " He also made " + numCrosses + " crosses.";
    }
}
