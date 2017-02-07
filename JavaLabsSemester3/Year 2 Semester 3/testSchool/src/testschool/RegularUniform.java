/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testschool;

/**
 *
 * @author x00125128
 */
public class RegularUniform extends Uniform {

    private String colour;
    private int howMany;
    private boolean coatRequired;

    public RegularUniform(String nameIn, boolean isPrimaryIn, String colourIn, int howManyIn, boolean coatRequiredIn) {

        super(nameIn, isPrimaryIn);
        colour = colourIn;
        howMany = howManyIn;
        coatRequired = coatRequiredIn;

    }

    /**
     * @return the howMany
     */
    public int getHowMany() {
        return howMany;
    }

    public double calculateCost() {

        System.out.println("Calculating Cost for " + colour + "Uniform with " + getName() + " on the Crest");
        double cost = (50 + (getName().length() * 1.5));
        if (coatRequired = true) {
            cost += 25;
        }

        return cost;

    }
}
