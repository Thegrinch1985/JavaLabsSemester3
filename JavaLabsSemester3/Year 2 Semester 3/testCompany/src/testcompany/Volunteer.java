/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcompany;

/**
 *
 * @author Howie
 */
public class Volunteer extends StaffMember {
    
    
    
    public Volunteer(String nameIn,String addressIn,String numberIn){
        
        super(nameIn,addressIn,numberIn);
    
    }
    @Override
    public double pay(){
        
        return 0;
    
    }
    
}
