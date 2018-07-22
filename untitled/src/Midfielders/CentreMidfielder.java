package Midfielders;

import java.util.Date;

public class CentreMidfielder extends Midfielder {

    private int numPasses;

    public void setNumPasses(int numPasses) {
        this.numPasses = numPasses;
    }

    public int getNumPasses() {
        return numPasses;
    }

    public CentreMidfielder(){
        super();
    }
    
    public CentreMidfielder(String name, Date dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int attacksStopped, int numPasses){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, attacksStopped);
        this.numPasses = numPasses;
    }

    public CentreMidfielder(CentreMidfielder a1) {
    		this.numPasses = a1.numPasses;
    }
    
    @Override
    public String toString() {
        return super.toString() + " He also made " + numPasses + "passes.";
    }
}
