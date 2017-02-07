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
public class Employee extends StaffMember {

    private String rsiNumber;
    protected double rateOfPay;

  
    

    public Employee(String nameIn, String addressIn, String numberIn, String rsiNumberIn, double payIn) {
        super(nameIn, addressIn, numberIn);
        rsiNumber = rsiNumberIn;
        rateOfPay = payIn;

    }

    public String toString() {

        String s;
        s = super.toString() + "Rsi Number : \t" 
                + rsiNumber + "\nPaid :\t\t€" + pay() + "\n";

        return s;

    }

    public double pay() {

        return rateOfPay;

    }

}
