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
public class Paint extends Material {
    
    private double numCoats,coverage;
    
    public Paint( String name, double price,double numCoats,double coverage) {
        super(name, price);
        this.numCoats = numCoats;
        this.coverage = coverage;
    }

    /**
     * @return the numCoats
     */
    public double getNumCoats() {
        return numCoats;
    }

    /**
     * @return the coverage
     */
    public double getCoverage() {
        return coverage;
    }
    


    @Override
    public double getRequiredMaterial(Surface s) {
 
    double amount =(((((s.getWidth() *s.getLength()) / 100)*80)*4)
            *getNumCoats())/getCoverage();
    //double litres = getPrice() *amount;
      
    
    return amount;
    }
    
    
}
