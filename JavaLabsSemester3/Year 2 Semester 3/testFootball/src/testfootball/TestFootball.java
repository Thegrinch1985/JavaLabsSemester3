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
public class TestFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Instantiating a new Football Game");
        System.out.println("Welcome to international Rules");

        FootballGame footballGameA = new FootballGame("Ireland", "Australia");
        MobilePhone ownerA = new MobilePhone("John");
        MobilePhone ownerB = new MobilePhone("Paul");
        
        System.out.println("Registering a new Listener to the Game");
        
        
        
        footballGameA.addFootballListener(ownerA);
        footballGameA.addFootballListener(ownerB);
        
        System.out.println("Simulating a game .....");
        
        footballGameA.notifyHomeTeamScored(7);
        footballGameA.notifyQuarterEnded(1);
        footballGameA.notifyAwayTeamScored(3);
        footballGameA.notifyAwayTeamScored(7);
        footballGameA.notifyQuarterEnded(2);
        footballGameA.notifyQuarterEnded(3);
        footballGameA.notifyHomeTeamScored(3);
        footballGameA.notifyHomeTeamScored(7);
        footballGameA.notifyQuarterEnded(4);
        //footballGameA.notifyQuarterEnded(5);
        
        
        

    }

}
