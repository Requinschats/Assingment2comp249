package forwards;

import forwards.Forward;

import java.util.Date;

public class Striker extends Forward {

    private double goalsToShotsRatio;

    public void setGoalsToShotsRatio(double goalsToShotsRatio) {
        this.goalsToShotsRatio = goalsToShotsRatio;
    }

    public double getGoalsToShotsRatio() {
        return goalsToShotsRatio;
    }

    public Striker(){
        super();
    }

    public Striker(String name, Date dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int goalsScored, int numAssists, int shotsOnTarget, int goalsToShotsRatio){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, goalsScored, numAssists, shotsOnTarget);
        this.goalsToShotsRatio = goalsToShotsRatio;
    }
    
    public Striker(Striker a1) {
    		this.goalsToShotsRatio = a1.goalsToShotsRatio;
    }

    @Override
    public String toString() {
        return super.toString() + " He also has a " + goalsToShotsRatio + " goals to shots ratio." ;
    }
}
