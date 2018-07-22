package Midfielders;

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

    public WideMidfielder(String name, Date dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int attacksStopped, int chancesCreated){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed, attacksStopped);
        this.chancesCreated = chancesCreated;
    }

    public WideMidfielder(WideMidfielder a1){
        this.chancesCreated = a1.chancesCreated;
    }

    @Override
    public String toString() {
        return super.toString() + " He also created " + chancesCreated + " chances.";
    }
}
