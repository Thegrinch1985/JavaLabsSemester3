/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca3lab17ifootball;

/**
 *
 * @author Howie
 */
public interface IFootball {
    
   
    void homeTeamScored(int points);
    void visitingTeamScored(int points);
    void endOfQuarter(int quarter);
    void setHomeTeam(String name);
    void setAwayTeam(String awayTeam);
}
