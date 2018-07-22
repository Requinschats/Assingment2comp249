package SoccerPlayer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SoccerPlayer {

    private String name;
    private SimpleDateFormat dob;
    private String clubName;
    private String countryName;
    private int numYellowCards;
    private int numRedCards;
    private int gamesPlayed;

    public void setName(String name) {
        this.name = name;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setDob(SimpleDateFormat dob) {
        this.dob = dob;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public void setNumRedCards(int numRedCards) {
        this.numRedCards = numRedCards;
    }

    public void setNumYellowCards(int numYellowCards) {
        this.numYellowCards = numYellowCards;
    }

    public String getName() {
        return name;
    }

    public SimpleDateFormat getDob() {
        return dob;
    }

    public String getClubName() {
        return clubName;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getNumRedCards() {
        return numRedCards;
    }

    public int getNumYellowCards() {
        return numYellowCards;
    }

    public SoccerPlayer() {
    }

    public SoccerPlayer(String name, SimpleDateFormat dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed) {
        this.clubName = clubName;
        this.countryName = countryName;
        this.dob = dob;
        this.gamesPlayed = gamesPlayed;
        this.name = name;
        this.numRedCards = numRedCards;
        this.numYellowCards = numYellowCards;
    }

    public String toString() {
        return name +" is a " + " x " + ". He is from " + countryName + " and plays for" + clubName + " club. He played " + gamesPlayed + " games this season.";
    }
}
