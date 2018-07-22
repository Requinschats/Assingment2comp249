package SoccerPlayer;

import java.util.Date;

public class SoccerPlayer {

    private String name;
    private Date dob;
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

    public void setDob(Date dob) {
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

    public Date getDob() {
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

    public SoccerPlayer(String name, Date dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed) {
        this.clubName = clubName;
        this.countryName = countryName;
        this.dob = dob;
        this.gamesPlayed = gamesPlayed;
        this.name = name;
        this.numRedCards = numRedCards;
        this.numYellowCards = numYellowCards;
    }
    
    public SoccerPlayer(SoccerPlayer a1) {
    		this.clubName = a1.clubName;
    		this.countryName = a1.countryName;
    		this.dob = a1.dob;
    		this.gamesPlayed = a1.gamesPlayed;
    		this.name = a1.name;
    		this.numRedCards = a1.numRedCards;
    		this.numYellowCards = a1.numYellowCards;
    }

    @Override
    public String toString() {
        return name + " is a "+ getClass().toString().substring(0, getClass().toString().indexOf(".")-1) + " player. He is from " + countryName + " and plays for " + clubName + ". ";
    }
}
