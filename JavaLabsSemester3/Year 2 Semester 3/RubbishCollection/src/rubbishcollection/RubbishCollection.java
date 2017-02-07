/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubbishcollection;

import java.util.Scanner;

/**
 *
 * @author Howie
 */
public class RubbishCollection {

    /**
     * @param args the command line arguments
     * @throws rubbishcollection.RefuseTruck.BinOverWeightException
     */
    public static void main(String[] args) throws RefuseTruck.BinOverWeightException  {

        Scanner input = new Scanner(System.in);

        RefuseTruck ex1 = new RefuseTruck();
      
        System.out.println("Enter Number of bins the Truck can collect ");
        ex1.setMaxBins(input.nextInt());
          int[] binWeight = new int[ex1.getMaxBins()];
        System.out.println("Enter cost per kilo ");
        ex1.setRatePerKg(input.nextInt());

        for (int i = 0; i < binWeight.length; i++) {
            System.out.println("Enter the weight for bin " + (i + 1));
            binWeight[i] = input.nextInt();
            ex1.collectBin(i);
        }
        
        ex1.printStats();
    }

}
