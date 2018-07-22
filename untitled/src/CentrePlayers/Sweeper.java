package CentrePlayers;

import java.util.Date;

public class Sweeper extends Defender {

    private int sweepUps;

    public void setSweepsUps(int sweepsUps) {
        this.sweepUps = sweepsUps;
    }

    public int getSweepsUps() {
        return sweepUps;
    }

    public Sweeper(){
        super();
    }

    public Sweeper(String name, Date dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, double numTackles, int sweepUps){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, numTackles);
        this.sweepUps = sweepUps;
    }

    public Sweeper(Sweeper a1) {
    		this.sweepUps = a1.sweepUps;
    }
    
    @Override
    public String toString() {
        return super.toString() + " The player also made " + sweepUps+ " sweep ups";
    }
}
