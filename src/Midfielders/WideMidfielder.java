package Midfielders;

import Midfielders.Midfielder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WideMidfielder extends Midfielder {

    private int chancesCreated;

    public void setChancesCreated(int chancesCreated) {
        this.chancesCreated = chancesCreated;
    }

    public int getChancesCreated() {
        return chancesCreated;
    }

    public WideMidfielder(){
        super();
    }
    public WideMidfielder(String name, SimpleDateFormat dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int attacksStopped, int chancesCreated){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, attacksStopped);
        this.chancesCreated = chancesCreated;
    }

    @Override
    public String toString() {
        return super.toString() + " He also created " + chancesCreated + " chances.";
    }
}
