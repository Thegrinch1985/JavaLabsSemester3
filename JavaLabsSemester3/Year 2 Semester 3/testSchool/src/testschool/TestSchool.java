/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testschool;

import java.util.Scanner;

/**
 *
 * @author x00125128
 */
public class TestSchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreSchools;
        do {

            System.out.println("What is the name of the School ?");
            String name = input.nextLine();
            System.out.println("Is this a PrimarySchool  ?true/false ");
            boolean isPrimary = input.nextBoolean();
            System.out.println("What colour should the School uniform be ?");
            String colour = input.next();
            System.out.println("How many of these Uniforms will you need ?");
            int howMany = input.nextInt();
            System.out.println("Does your uniform require an extra coat true/false");
            boolean coatRequired = input.nextBoolean();
            RegularUniform ru = new RegularUniform(name, isPrimary, colour, howMany, coatRequired);
            double unitCost = ru.calculateCost();
            System.out.println("The Unit cost of this School uniform is : " + unitCost + " each");
            System.out.println("The total cost of all the school uniform is " + (unitCost * ru.getHowMany()));
            totalCost = totalCost + (totalCost * ru.getHowMany());
            if (ru.isIsPrimary() == false) {

                System.out.println("Do you Require a sports Uniform ?");
                boolean requiresSportsUniform = input.nextBoolean();
                if (requiresSportsUniform == true) {
                    System.out.println("What quality of material do you want (0-100)");
                    int materialQuality = input.nextInt();
                    System.out.println("Does your uniform require any Special footwear ? true/false");
                    boolean footwearRequired = input.nextBoolean();
                    SportsUniform su = new SportsUniform(name, false, materialQuality, footwearRequired);
                    double sunit = su.calculateCost();
                    System.out.println("The unit cost of this sports uniform order is " + sunit);
                    System.out.println("The total cost of all the sports uniforms is " + (sunit * ru.getHowMany()));
                    totalCost = totalCost + (sunit * ru.getHowMany());

                }

            }
            System.out.println("Do you wish to process another School Uniform order ? true/false");
            moreSchools = input.nextBoolean();
            input.nextLine();

        } while (moreSchools == true);
        System.out.println("Total Cost for all the Schools was " + totalCost);

    }

}
