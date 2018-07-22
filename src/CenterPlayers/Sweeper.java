package CenterPlayers;

import CenterPlayers.Defender;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sweeper extends Defender {

    private int sweepsUps;

    public void setSweepsUps(int sweepsUps) {
        this.sweepsUps = sweepsUps;
    }

    public int getSweepsUps() {
        return sweepsUps;
    }

    public Sweeper(){
        super();
    }

    public Sweeper(String name, SimpleDateFormat dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, double numTackles, int sweepsUps){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, numTackles);
        this.sweepsUps = sweepsUps;
    }

    @Override
    public String toString() {
        return super.toString() + " The player also made " + sweepsUps+ " sweep ups";
    }
}
