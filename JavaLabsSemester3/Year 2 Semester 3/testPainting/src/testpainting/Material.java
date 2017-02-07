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
public abstract class Material {
    
    private String name ;
    private double price;

    public Material(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    
    public abstract double getRequiredMaterial(Surface s);
    
    public double calcTotalPrice(Surface s){
        
        double price1 = getRequiredMaterial(s);
        double price2 = 0;
        price2 = price1 * getPrice();
        
    
    return price2;
    }
    
    
}
