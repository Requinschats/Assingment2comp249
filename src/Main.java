import CenterPlayers.CentreBack;
import CenterPlayers.Defender;
import SoccerPlayer.SoccerPlayer;
import Goalkeeper.Goalkeeper;
import Midfielders.WideMidfielder;

import java.text.SimpleDateFormat;

import java.util.Date;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        SoccerPlayer centreBack = new CentreBack("Olivier", new SimpleDateFormat("2012-04-02"), "Dragons de Hull", "Canada", 0, 2, 150, 2.1, 1);
        SoccerPlayer goalkeeper1 = new Goalkeeper();
        SoccerPlayer goalkeeper2 = new Goalkeeper();
        SoccerPlayer wideMidFielder = new WideMidfielder();
        SoccerPlayer[] team = new SoccerPlayer[18];
        SoccerPlayer bestScorer = SoccerPlayer[0];
        SoccerPlayer worstScorer = SoccerPlayer[0];

        //to become a method
        out.println();
        out.println(centreBack.toString());
        out.println();
        out.println(goalkeeper.toString());
        out.println();
        out.println(wideMidFielder.toString());
        out.println();
        out.println(goalkeeper1.equals(goalkeeper2));
        out.println(goalkeeper1.equals(wideMidFielder));
        out.println();

        //to become a method with two parameters
        for (int i=1; i<18; i++){
            if(team[i].getGoals()>team[i-1]){
                bestScorer = team[i];
            }
            if(team[i].getGoals()<team[i-1]){
                worstScorer = team[i];
            }
        }
        out.println("The best scorer is " + bestScorer.toString()+ " and the worst scorer is "+worstScorer.toString()+".");



    }
}
