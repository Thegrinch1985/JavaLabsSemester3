/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrockband;

import java.util.Scanner;

/**
 *
 * @author Howie
 */
public class TestRockband {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String names[] = {"John", "Paul", "George", "Ringo"};
        String instruments[] = {"Keyboards", "Guitar", "Guitar", "Drums"};
        Rockband theBeatles = new Rockband("The Beatles", "Apple", names,
                instruments);

        System.out.println(theBeatles);

        System.out.println("Please neter new Label");
        String label = input.nextLine();

        if (!theBeatles.changeRecordLabel(label)) {
            System.out.println("Label Not changed");
        } else {
            System.out.println("Label Changed");
            System.out.println(theBeatles);
        }
    }

}
