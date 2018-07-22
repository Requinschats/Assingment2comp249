package CenterPlayers;

import CenterPlayers.Defender;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WingBack extends Defender {

    private int throwsIns;

    public void setThrowsIns(int throwsIns) {
        this.throwsIns = throwsIns;
    }

    public int getThrowsIns() {
        return throwsIns;
    }

    public WingBack(){
        super();
    }
    public WingBack(String name, SimpleDateFormat dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, double numTackles, int throwsIns){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, numTackles);
        this.throwsIns = throwsIns;
    }

    @Override
    public String toString() {
        return super.toString() + " The player made " + throwsIns + " throws in.";
    }
}
