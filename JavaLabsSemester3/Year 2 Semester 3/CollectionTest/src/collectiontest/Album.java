/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontest;

/**
 *
 * @author Howie
 */
public class Album {
    
    public String title,band;
    public double cost;

    public Album(String title, String band, double cost) {
        this.title = title;
        this.band = band;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getBand() {
        return band;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "\nTitle : " + getTitle() + "\nBand :" + getBand() + "\nCost :" + String.format("%,.2f",getCost());
    }
    
    
}
