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
public abstract class StaffMember {
    
    protected String name;
    protected String address;
    protected String number;
    
    
    public StaffMember(String nameIn,String addressIn,String numberIn){
    name = nameIn;
    address = addressIn;
    number = numberIn;
    }
    
    public String toString(){
        
        String s;
        
        s= "Name : \t\t" + name + "\nAddress : \t" + address+ "\nNumber :\t"+ number+"\n";
        return s;
    
    }
    public abstract double pay();
    
}
