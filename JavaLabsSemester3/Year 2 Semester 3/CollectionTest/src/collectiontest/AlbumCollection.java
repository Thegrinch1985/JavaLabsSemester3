/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontest;

import java.util.ArrayList;

/**
 *
 * @author Howie
 */
public class AlbumCollection {

    private ArrayList<Album> collection;
    private int count;
    private double totalCost;

    public AlbumCollection() {

        collection = new ArrayList<>();
        count = 0;
        totalCost = 0;

    }

    public AlbumCollection(ArrayList<Album> collection, int count, double totalCost) {
        this.collection = collection;
        this.count = count;
        this.totalCost = totalCost;
    }

    public void addAlbum(String title, String band, double cost) {

        collection.add(new Album(title, band, cost));
        totalCost += cost;
        count++;
    }

    public ArrayList<collectiontest.Album> getCollection() {
        return collection;
    }

    @Override
    public String toString() {

        String report = "~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "My Album Collection\n\n ";

        report += "Number of Album's" + count + "\n";
        report += "Total Cost " + String.format("%,.2f", totalCost);
        report += "Average Cost " + String.format("%,.2f", totalCost / count);

        report += "\n\n Album List : \n\n";

        for (int i = 0; i < count; i++) 
            report += collection.get(i) + "\n";
        

        return report;

    }

}
