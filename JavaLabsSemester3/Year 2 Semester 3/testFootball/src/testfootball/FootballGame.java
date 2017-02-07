/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfootball;

import java.util.ArrayList;

/**
 *
 * @author x00125128
 */
public class FootballGame {

    private String homeTeams, awayTeams;
    ArrayList<IFootball> ex1;

    public FootballGame(String homeTeams, String awayTeams) {
        this.homeTeams = homeTeams;
        this.awayTeams = awayTeams;
        ex1 = new ArrayList<IFootball>();
    }

    public void addFootballListener(IFootball f) {

        ex1.add(f);
        f.setHomeTeam(homeTeams);
        f.setVisitingTeam(awayTeams);

    }

    public void notifyHomeTeamScored(int numOfPoints) {

        for (int i = 0; i < ex1.size(); i++) {

            ex1.get(i).homeTeamScored(numOfPoints);

        }
    }

    public void notifyAwayTeamScored(int numOfPoints) {

        for (int i = 0; i < ex1.size(); i++) {

            ex1.get(i).visitingTeamScored(numOfPoints);

        }
    }
    public void notifyQuarterEnded(int quarter){
        
        for (int i = 0; i < ex1.size(); i++) {
            
            ex1.get(i).endOfQuarter(quarter);
            
        }
    
    }

}
