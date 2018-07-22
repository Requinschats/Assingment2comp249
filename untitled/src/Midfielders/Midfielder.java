package Midfielders;

import SoccerPlayer.SoccerPlayer;


import java.util.Date;

public class Midfielder extends SoccerPlayer  {

    private int attacksStopped;

    public void setAttacksStopped(int attacksStopped) {
        this.attacksStopped = attacksStopped;
    }

    public int getAttacksStopped() {
        return attacksStopped;
    }

    public Midfielder(){
        super();
    }

    public Midfielder(String name, Date dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int attacksStopped){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed);
          this.attacksStopped = attacksStopped;
    }

    public Midfielder(Midfielder a1) {
        this.attacksStopped = a1.attacksStopped;
    }


    public String toString() {
        return super.toString() + " The midfielder stopped " + attacksStopped + " attacks.";
    }
}
