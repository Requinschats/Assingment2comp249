package Midfielders;

import Midfielders.Midfielder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CenreMidfielder extends Midfielder {

    private int numPasses;

    public void setNumPasses(int numPasses) {
        this.numPasses = numPasses;
    }

    public int getNumPasses() {
        return numPasses;
    }

    public CenreMidfielder(){
        super();
    }
    public CenreMidfielder(String name, SimpleDateFormat dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int attacksStopped, int numPasses){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, attacksStopped);
        this.numPasses = numPasses;
    }

    @Override
    public String toString() {
        return super.toString() + " He also made " + numPasses + "passes.";
    }
}
