/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfootball;

/**
 *
 * @author x00125128
 */
public interface IFootball {
    
    
    void homeTeamScored(int points);
    void visitingTeamScored(int points);
    void endOfQuarter(int quarter);
    void setHomeTeam(String name);
    void setVisitingTeam(String name);
}
