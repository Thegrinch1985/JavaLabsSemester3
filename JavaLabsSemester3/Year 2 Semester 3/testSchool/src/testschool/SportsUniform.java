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
public class SportsUniform extends Uniform {
    
    private int materialQuality;
    private boolean footwearRequired;
    
    
    public SportsUniform(String nameIn, boolean isPrimaryIn,int materialQualityIn,boolean footwearRequiredIn){
        
        super(nameIn, isPrimaryIn);
        materialQuality = materialQualityIn;
        footwearRequired = footwearRequiredIn;
    
    
    }
    public double calculateCost(){
    double cost;
    cost = 25+ (materialQuality*.5);
    if(footwearRequired = true)
    {
    cost+=15;
    }
    return cost;
    }
    
}
