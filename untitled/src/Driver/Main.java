package Driver;

import CentrePlayers.*;
import Midfielders.*;
import SoccerPlayer.SoccerPlayer;
import Goalkeeper.*;
import forwards.CentreForward;
import forwards.Striker;
import forwards.Winger;

import java.util.stream.*;
import java.util.*;
import java.util.List;

import static java.lang.System.out;

public class Main {

    //à revoir
    public static SoccerPlayer[] teamSimilarTo(SoccerPlayer[] team) {

        SoccerPlayer[] teamCopy = new SoccerPlayer[team.length - 1];

        for (int i = 0; i < team.length - 1; i++) {
            teamCopy[i] = team[i];
        }
        return teamCopy;
    }

    public static void main(String[] args) {

        SoccerPlayer centreBack = new CentreBack("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2.1, 1);
        SoccerPlayer goalkeeper1 = new Goalkeeper("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1, 1);
        SoccerPlayer goalkeeper2 = new Goalkeeper("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 1, 1, 1);
        SoccerPlayer wideMidFielder = new WideMidfielder("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1);
        SoccerPlayer[] team = new SoccerPlayer[18];
        team[0] = new CentreBack("Olivier", new GregorianCalendar(2014, Calendar.FEBRUARY, 10).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2.1, 1);
        team[1] = new Sweeper("Jean", new GregorianCalendar(2013, Calendar.JANUARY, 11).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2.1, 1);
        team[2] = new WingBack("Philipe", new GregorianCalendar(2012, Calendar.NOVEMBER, 12).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2.1, 1);
        team[3] = new CentreForward("Marc", new GregorianCalendar(2011, Calendar.AUGUST, 13).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1, 1, 1);
        team[4] = new Striker("Antoine", new GregorianCalendar(2010, Calendar.AUGUST, 14).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1, 1, 1);
        team[5] = new Striker("Gabriel", new GregorianCalendar(2009, Calendar.FEBRUARY, 15).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1, 1, 1);
        team[6] = new Winger("Benoit", new GregorianCalendar(2008, Calendar.JANUARY, 16).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1, 1, 1);
        team[7] = new Goalkeeper("Jacob", new GregorianCalendar(2007, Calendar.FEBRUARY, 17).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1, 1);
        team[8] = new CentreMidfielder("Anthony", new GregorianCalendar(2006, Calendar.JUNE, 18).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1);
        team[9] = new DefensiveMidfielder("Jeremy", new GregorianCalendar(2005, Calendar.FEBRUARY, 19).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1);
        team[10] = new WideMidfielder("Louis", new GregorianCalendar(2004, Calendar.FEBRUARY, 20).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1);
        team[11] = new Goalkeeper("Marc", new GregorianCalendar(2003, Calendar.JULY, 22).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1, 1);
        team[12] = new CentreMidfielder("Patrick", new GregorianCalendar(2002, Calendar.JULY, 23).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1);
        team[13] = new CentreBack("Pierre", new GregorianCalendar(2001, Calendar.DECEMBER, 24).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2.1, 1);
        team[14] = new CentreForward("Caca", new GregorianCalendar(2000, Calendar.DECEMBER, 25).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1, 1, 1);
        team[15] = new Striker("William", new GregorianCalendar(2001, Calendar.JANUARY, 30).getTime(), "Dragons de Hull", "Canada", 2, 2, 150, 2, 1, 1, 1);
        team[16] = new Winger("Vincent", new GregorianCalendar(2002, Calendar.FEBRUARY, 12).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1, 1, 1);
        team[17] = new DefensiveMidfielder("Mamadou", new GregorianCalendar(2003, Calendar.FEBRUARY, 1).getTime(), "Dragons de Hull", "Canada", 0, 2, 150, 2, 1);
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
        for (int i = 1; i < 18; i++) {
            if (team[i].getNumRedCards() > team[i - 1].getNumRedCards()) {
                bestScorer = team[i];
            }
            if (team[i].getNumRedCards() < team[i - 1].getNumRedCards()) {
                worstScorer = team[i];
            }
        }
        out.println("The best scorer is " + bestScorer.toString() + " and the worst scorer is " + worstScorer.toString() + ".");

        //to become a method: player same club mapping
        out.println();
        Map<String, List<SoccerPlayer>> groupedByClub = Arrays.stream(team).collect(Collectors.groupingBy(SoccerPlayer::getClubName));
        out.println(groupedByClub.toString());

        SoccerPlayer[] copyTeam = new SoccerPlayer[18];
        copyTeam = teamSimilarTo(copyTeam);
        out.println();
        for (int i = 0; i < 18; i++) {
            out.println();
            out.println( "Content of the copy array: " + i + ". " + copyTeam[i].toString());
            out.println(" Content of the original array " + i + ". " + team[i].toString());
        }

    }
}



