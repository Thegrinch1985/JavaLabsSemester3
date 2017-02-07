/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtestpayer;

import java.util.Scanner;

/**
 *
 * @author x00125128
 */
public class TestTestpayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] numbers ;
        double[]salaries;
        TaxPayer[] tx;
        
        System.out.println("Please enter Number of Tax Payers");
        int num = input.nextInt();
        numbers = new int[num];
        salaries = new double[num];
        tx = new TaxPayer[num];
        
 
    
        
        for(int i = 0; i < tx.length;i++)
        {
            System.out.println("Please enter Rsi Number for Tax Payer " + (i+1));
            numbers[i] = input.nextInt();
            System.out.println("Please enter the Salary for the Tax Payer " + (i+1));
            salaries[i] = input.nextDouble();
            
            tx[i] = new TaxPayer(numbers[i],salaries[i]);
            
            
        }
       
        for(int i = 0; i < tx.length;i++)
        {
        System.out.println(tx[i]);
        }
        
        
     
    }
    
}
