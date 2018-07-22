package Goalkeeper;
import SoccerPlayer.SoccerPlayer;
import java.util.Date;

public class Goalkeeper extends SoccerPlayer {
    
    private int goalsAllowed;
    private int shotsOnGoal;
    private int numSaves;

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public void setShotsOnGoal(int shotsOnGoal) {
        this.shotsOnGoal = shotsOnGoal;
    }

    public void setNumSaves(int numSaves) {
        this.numSaves = numSaves;
    }

    public int getShotsOnGoal() {
        return shotsOnGoal;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public int getNumSaves() {
        return numSaves;
    }

    public Goalkeeper(){
        super();
    }
    
    public Goalkeeper(String name, Date dob, String clubName, String countryName, int numRedCards, int numYellowCards, int gamesPlayed, int goalsAllowed, int shotsOnGoal, int numSaves){
        super(name, dob, clubName, countryName, numRedCards, numYellowCards, gamesPlayed);
        this.goalsAllowed = goalsAllowed;
        this.shotsOnGoal = shotsOnGoal;
        this.numSaves = numSaves;
    }
    
    public Goalkeeper(Goalkeeper a1) {
    		this.goalsAllowed = a1.goalsAllowed;
    		this.shotsOnGoal = a1.shotsOnGoal;
    		this.numSaves = a1.numSaves;
    }

    public String toString() {
        return super.toString() + "The goaler allowed " + goalsAllowed + " goals on a total of " +shotsOnGoal+ " shots. He made a total of " + numSaves + " saves. ";
    }
}
