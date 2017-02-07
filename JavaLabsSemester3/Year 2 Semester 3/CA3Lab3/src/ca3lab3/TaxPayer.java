/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca3lab3;

/**
 *
 * @author x00125128
 */
public class TaxPayer {

    double rsiNumber;
    double grossIncome;

    public TaxPayer() {

    }

    public TaxPayer(int rsiNumber, double grossIncome) {
        this.rsiNumber = rsiNumber;
        this.grossIncome = grossIncome;
    }

    public double getRsiNumber() {
        return rsiNumber;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setRsiNumber(int rsiNumber) {
        this.rsiNumber = rsiNumber;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    @Override
    public String toString() {
        return "RSI no  ="+ rsiNumber + String.format("%nGross Salary = € %,.2f" ,grossIncome);
    }
    

}
