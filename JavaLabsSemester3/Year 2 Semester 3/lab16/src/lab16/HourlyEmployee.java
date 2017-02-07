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
public class HourlyEmployee extends Employee {

    /**
     * @return the numofEmployees
     */
    public static int getNumofEmployees() {
        return numofEmployees;
    }

    /**
     * @return the invoices
     */
    public static int getInvoices() {
        return invoices;
    }

    /**
     * @return the total
     */
    public static double getTotal() {
        return total;
    }

    /**
     * @return the totalTax
     */
    public static double getTotalTax() {
        return totalTax;
    }

    private double hoursWorked;
    private double rateOfPay;
    static int numofEmployees;
    static int invoices;
    static double total;
    static double totalTax;

    public HourlyEmployee(String fname, String lName, String rsiNumber, double hoursWorked, double rateOfPay) {
        super(fname, lName, rsiNumber);
        this.hoursWorked = hoursWorked;
        this.rateOfPay = rateOfPay;
    }

    @Override
    public double getPaymentAmount() {
        double amount = 0;
        double tax= 0;
        double tax1 = 0;
        double amount1 = 0;
        double pay = 0;

        amount = hoursWorked * rateOfPay;

        if (amount >= 0 && amount < 200) {
            pay = amount;
            
            //System.out.println("in here");
        } else if (amount >= 200 && amount <= 300) {
            tax = ((hoursWorked * rateOfPay) / 100) * LOW_TAX_RATE;
            pay = amount - tax;
            totalTax += tax;
            

        } else if (amount > 300) {
            System.out.println(amount);
            tax = ((amount - THREE) / 100) * HIGH_TAX_RATE;//630
            System.out.println(tax);
            System.out.println(amount);
            
            tax1 = ((THREE) / 100) * LOW_TAX_RATE; //69
            System.out.println(tax1);
            totalTax += tax+tax1;
            
            amount1 = tax + tax1;
            pay = amount - amount1;

        } // pay = 
        
        return pay;

    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRateOfPay() {
        return rateOfPay;
    }

    public void setRateOfPay(double rateOfPay) {
        this.rateOfPay = rateOfPay;
    }

    public String toString() {
        return super.toString() + "\nWeekly Salary \t€" + getPaymentAmount() + "\n**************************************";
    }

}
