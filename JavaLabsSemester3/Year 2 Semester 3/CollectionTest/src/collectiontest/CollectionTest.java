/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontest;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Howie
 */
public class CollectionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        AlbumCollection albums = new AlbumCollection();

        albums.addAlbum("HolyWood", "Marilyn Manson", 19.99);
        albums.addAlbum("The Wall", "Pink Floyd", 15.99);
        albums.addAlbum("The Piper at the gates of dawn", "Pink Floyd", 21.99);
        albums.addAlbum("AM", "Arctic Monkeys", 10.99);

        System.out.println("Please enter your sort preference : Title or Cost");
        String pref = input.nextLine();

        if (pref.equals("Title")) {
            Collections.sort(albums.getCollection(), new Comparator<Album>() {

                @Override
                public int compare(Album a1, Album a2 ){

                    return a1.getTitle().compareTo(a2.getTitle());

                }
            });
        } else if (pref.equalsIgnoreCase("Cost")) {
            Collections.sort(albums.getCollection(), new Comparator<Album>() {

                @Override
                public int compare(Album a1, Album a2) {
                    return (int) (a1.getCost() - a2.getCost());
                }

            });
        }
        System.out.println(albums);

    }
    


        
        }
            
            
            
        
        
        
        
    
    


