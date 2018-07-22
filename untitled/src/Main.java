import CentrePlayers.*;
import Midfielders.*;
import SoccerPlayer.SoccerPlayer;
import Goalkeeper.*;
import forwards.CentreForward;
import forwards.Striker;
import forwards.Winger;

import java.util.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        SoccerPlayer centreBack = new CentreBack("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2.1, 1);
        SoccerPlayer goalkeeper1 = new Goalkeeper("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1, 1);
        SoccerPlayer goalkeeper2 = new Goalkeeper("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 1, 1,1 );
        SoccerPlayer wideMidFielder = new WideMidfielder("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1);
        SoccerPlayer[] team = new SoccerPlayer[18];
        team[0] = new CentreBack("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2.1, 1);
        team[1] = new Sweeper("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2.1, 1);
        team[2] = new WingBack("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2.1, 1);
        team[3] = new CentreForward("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1,1,1);
        team[4] = new Striker("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1,1,1);
        team[5] = new Striker("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1,1,1);
        team[6] = new Winger("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1,1,1);
        team[7] = new Goalkeeper("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1,1);
        team[8] = new CentreMidfielder("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1);
        team[9] = new DefensiveMidfielder("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1);
        team[10] = new WideMidfielder("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1);
        team[11] = new Goalkeeper("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1,1);
        team[12] = new CentreMidfielder("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1);
        team[13] = new CentreBack("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2.1, 1);
        team[14] = new CentreForward("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1,1,1);
        team[15] = new Striker("Caca", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 2, 2, 150, 2, 1,1,1);
        team[16] = new Winger("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1,1,1);
        team[17] = new DefensiveMidfielder("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1);
        SoccerPlayer bestScorer = team[0];
        SoccerPlayer worstScorer = team[0];



        //to become a method
        out.println();
        out.println(centreBack.toString());
        out.println();
        out.println(goalkeeper1.toString());
        out.println();
        out.println(wideMidFielder.toString());
        out.println();
        out.println(goalkeeper1.equals(goalkeeper2));
        out.println(goalkeeper1.equals(wideMidFielder));
        out.println();

        //to become a method with two parameters
        for (int i=1; i<18; i++){
            if(team[i].getNumRedCards()>team[i-1].getNumRedCards()){
                bestScorer = team[i];
            }
            if(team[i].getNumRedCards()<team[i-1].getNumRedCards()){
                worstScorer = team[i];
            }
        }
        out.println("The best scorer is " + bestScorer.toString()+ " and the worst scorer is "+worstScorer.toString()+".");



    }
}

