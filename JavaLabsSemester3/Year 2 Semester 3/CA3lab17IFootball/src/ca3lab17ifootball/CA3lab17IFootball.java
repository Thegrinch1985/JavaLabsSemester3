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
public class CA3lab17IFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Instantiating a new FootballGame");
        System.out.println("Welcome to the International Rules");
        
        FootBallGame footballgameA = new FootBallGame("Ireland","Australia");
        
        System.out.println("Instansting a listener");
        
        MobilePhone ex1 = new MobilePhone("John");
        MobilePhone ex2 = new MobilePhone("Damo");
        MobilePhone ex3 = new MobilePhone("Joe");
        
        System.out.println("Registering a listener to the game ");
        
        footballgameA.addFootballListener(ex1);
        footballgameA.addFootballListener(ex2);
        footballgameA.addFootballListener(ex3);
        
        System.out.println("Simulating a game");
        
        footballgameA.notifyHomeTeamScored(7);
        footballgameA.notifyQuarterEnded(1);
        footballgameA.notifyVisitingTeamScored(3);
        footballgameA.notifyVisitingTeamScored(7);
        footballgameA.notifyQuarterEnded(2);
        footballgameA.notifyQuarterEnded(3);
        footballgameA.notifyHomeTeamScored(3);
        footballgameA.notifyHomeTeamScored(7);
        footballgameA.notifyQuarterEnded(4);
    }
    
}
