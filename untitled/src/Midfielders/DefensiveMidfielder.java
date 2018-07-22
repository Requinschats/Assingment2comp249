package Midfielders;

import java.util.Date;

public class DefensiveMidfielder extends Midfielder {

    private int intercepts;

    public void setIntercepts(int intercepts) {
        this.intercepts = intercepts;
    }

    public int getIntercepts() {
        return intercepts;
    }

    public DefensiveMidfielder(){
        super();
    }
    public DefensiveMidfielder(String name, Date dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int attacksStopped, int intercepts){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, attacksStopped);
        this.intercepts = intercepts;
    }
    
    public DefensiveMidfielder(DefensiveMidfielder a1) {
    		this.intercepts = a1.intercepts;
    }

    @Override
    public String toString() {
        return super.toString() + " He also made " + intercepts + " intercepts.";
    }
}
