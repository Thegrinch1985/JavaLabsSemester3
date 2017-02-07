/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16;

/**
 *
 * @author x00125128
 */
public abstract class Employee implements iPayable{
    
    private String fname;
    private String lName;
    private String rsiNumber;

    public Employee(String fname, String lName, String rsiNumber) {
        this.fname = fname;
        this.lName = lName;
        this.rsiNumber = rsiNumber;
        HourlyEmployee.numofEmployees++;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getRsiNumber() {
        return rsiNumber;
    }

    public void setRsiNumber(String rsiNumber) {
        this.rsiNumber = rsiNumber;
    }


   
    public String toString (){
    
        return "Employee : \t" +"\nFirst Name\t"+ fname + "\nLast Name \t"+ lName + "\nRSI Number : \t" + rsiNumber
                
               ;
    }
    
    
    
}
