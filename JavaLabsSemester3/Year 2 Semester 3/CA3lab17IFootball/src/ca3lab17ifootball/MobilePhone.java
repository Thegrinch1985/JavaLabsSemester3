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
public class MobilePhone implements IFootball {

    private String homeTeam, awayTeam, owner;
    private int homeScore, awayScore, currentQuarter;

    public MobilePhone(String owner) {
        this.owner = owner;
        currentQuarter = 1;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public void dislayQuarter() {

        if (currentQuarter > 0) {
            System.out.println("Hi" + owner + " the game is in quarter " + currentQuarter);
        } else {
            System.out.println("Hi " + owner + "The Final Score ");
        }

    }
    public void updateScore(){
        
        System.out.println(homeTeam + ":" +homeScore);
        System.out.println(awayTeam + ":" +awayScore);
        dislayQuarter();
    
    }
    @Override
    public void homeTeamScored(int points) {
        
        System.out.println("Hi" + owner + " " + homeTeam +
                "has just scored" + points + "points");
        homeScore += points;
        updateScore();
        
        
    }

    @Override
    public void visitingTeamScored(int points) {
            System.out.println("Hi" + owner + " " + awayTeam +
                "has just scored" + points + "points");
        awayScore += points;
        updateScore();
        
        
    
    }

    @Override
    public void endOfQuarter(int quarter) {
        
        if(quarter >= 1 && quarter <= 3)
        {
        currentQuarter++;
        }
        else{
            currentQuarter =-1;
        }
        System.out.println("Hi" + owner + " Quarter " + quarter
        + "has just ended");
        updateScore();
    
    }

    @Override
    public void setHomeTeam(String name) {
        
        homeTeam = name;
    
    }

    @Override
    public void setAwayTeam(String awayTeamIn) {
        
        awayTeam = awayTeamIn;
    
    }

}
