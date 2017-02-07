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
public abstract class Uniform {

    private String name;
    private boolean isPrimary;

    public Uniform() {
        name = "";
        isPrimary = false;
    }

    public Uniform(String nameIn, boolean isPrimaryIn) {

        name = nameIn;
        isPrimary = isPrimaryIn;

    }

    public abstract double calculateCost();

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the isPrimary
     */
    public boolean isIsPrimary() {
        return isPrimary;
    }

}
