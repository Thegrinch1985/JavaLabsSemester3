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
public class MobilePhone implements IFootball {

    private String homeTeam, awayTeam, owner;
    private int homeScore, awayScore;
    private int currentQuarter;

    public MobilePhone(String owner) {

        this.owner = owner;
        this.currentQuarter = 1;
    }

    public void displayQuarter() {

        if (currentQuarter > 0) {
            System.out.println("Hi " + owner + " the  Game is in Quarter " + currentQuarter);
        } else {
            System.out.println("Hi " + owner + " Final Score");
            
        }

    }

    public void updateScore() {

        System.out.println(homeTeam + " :" + homeScore);
        System.out.println(awayTeam + " :" + awayScore);
        displayQuarter();

    }

    @Override
    public void homeTeamScored(int points) {

        System.out.println("Hi " + owner + " " + homeTeam + " has just scored " + points + " points");
        homeScore += points;
        updateScore();
    }

    @Override
    public void visitingTeamScored(int points) {

        System.out.println("Hi " + owner + " " + awayTeam + " has just scored " + points + " points");
        awayScore += points;
        updateScore();
    }

    @Override
    public void endOfQuarter(int quarter) {

        if (quarter >= 1 && quarter <= 3) {
            currentQuarter++;
            System.out.println("Hi " + owner + " Quarter " + quarter + " has just ended");
            updateScore();

        } else {
            currentQuarter = -1;
          
        }
          System.out.println("Hi " + owner + " Quarter " + quarter + " has just ended");
            updateScore();
    }

    @Override
    public void setHomeTeam(String name) {
        
        homeTeam = name;
    }

    @Override
    public void setVisitingTeam(String name) {
        awayTeam = name;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(String awayTeam) {
    }

    /**
     * @return the homeTeam
     */


}
