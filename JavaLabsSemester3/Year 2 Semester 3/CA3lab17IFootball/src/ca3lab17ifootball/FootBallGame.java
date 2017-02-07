/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca3lab17ifootball;

import java.util.ArrayList;

/**
 *
 * @author Howie
 */
public class FootBallGame {
    
    private String homeTeam, awayTeam;
    
    ArrayList<IFootball> ex1;
    
    public FootBallGame(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.ex1 = new ArrayList<IFootball>();
    }
    
    public void addFootballListener(IFootball f) {
        
        ex1.add(f);
        
        f.setHomeTeam(homeTeam);
        f.setAwayTeam(awayTeam);
        
    }
    public void notifyVisitingTeamScored(int numOfPoints){
        
        for(int i = 0; i < ex1.size();i++)
        {
            ex1.get(i).visitingTeamScored(numOfPoints);
        }}
        
      public void notifyHomeTeamScored(int numOfPoints){
        
        for(int i = 0; i < ex1.size();i++)
        {
            ex1.get(i).homeTeamScored(numOfPoints);
        }
    }
      public void notifyQuarterEnded(int quarter){
          
          for (int i = 0; i < ex1.size(); i++) {
              
              ex1.get(i).endOfQuarter(quarter);
              
          }
      
      
      }
    
}
