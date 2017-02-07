/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtestpayer;

/**
 *
 * @author x00125128
 */
public class TaxPayer {
    
    private int rsiNumber;
    private double grossIncome;
    
    public TaxPayer(){
        
        rsiNumber = 0;
        grossIncome = 0;
        
    
    }
    public TaxPayer(int rsiNumberIn, double grossIncomeIn){
        
        rsiNumber = rsiNumberIn;
        grossIncome = grossIncomeIn;
    
    }

    /**
     * @return the rsiNumber
     */
    public int getRsiNumber() {
        return rsiNumber;
    }

    /**
     * @param rsiNumber the rsiNumber to set
     */
    public void setRsiNumber(int rsiNumber) {
        this.rsiNumber = rsiNumber;
    }

    /**
     * @return the grossIncome
     */
    public double getGrossIncome() {
        return grossIncome;
    }

    /**
     * @param grossIncome the grossIncome to set
     */
    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }
    
    @Override
    public String toString(){
        
        String s;
        
       s = "RSI no = " + rsiNumber + "\n" + String.format("Gross salary = €%,.2f" , grossIncome); 
    
    return s;
    }
    
}
