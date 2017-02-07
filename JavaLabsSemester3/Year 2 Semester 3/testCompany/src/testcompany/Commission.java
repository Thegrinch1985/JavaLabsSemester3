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
public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;

    public Commission(String nameIn, String addressIn, String numberIn, String rsiNumberIn, double payIn,double commissionRateIn) {

        super(nameIn,addressIn,numberIn, rsiNumberIn,payIn);
        totalSales = 0;
        commissionRate = commissionRateIn;

    }

    public void addSales(double sales) {

        totalSales = sales;

    }
    public double pay(){
        double pay = 0;
        pay = (super.pay()+ (totalSales * commissionRate));
        return pay;
    
    }

    @Override
    public String toString() {
        
        String s; 
        
        s = super.toString() + "Total Sales : \t€" + totalSales +  "\n";
        return s;
        
        

    }
}
