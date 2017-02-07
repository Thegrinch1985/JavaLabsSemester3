/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpainting;

/**
 *
 * @author x00125128
 */
public class Flooring extends Material{
    
    
    private double coveragePerPack;

    public Flooring( String name, double price,double coveragePerPack) {
        super(name, price);
        this.coveragePerPack = coveragePerPack;
    }
    
    
    

    @Override
    public double getRequiredMaterial(Surface s) {
            double amount =((s.getWidth() * s.getLength())
            /getCoveragePerPack());

    return amount;}

    /**
     * @return the coveragePerPack
     */
    public double getCoveragePerPack() {
        return coveragePerPack;
    }

    /**
     * @param coveragePerPack the coveragePerPack to set
     */
    public void setCoveragePerPack(double coveragePerPack) {
        this.coveragePerPack = coveragePerPack;
    }
    
}
