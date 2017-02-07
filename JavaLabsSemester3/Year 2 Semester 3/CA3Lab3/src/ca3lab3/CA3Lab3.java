/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca3lab3;

import java.util.Scanner;

/**
 *
 * @author x00125128
 */
public class CA3Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num;
        double rsi[] ;
        double salary[];
        TaxPayer ex1[];
        
        System.out.println("Please enter Number of TaxPayers");
        num = input.nextInt();
        ex1 = new TaxPayer[num];
        rsi = new double[num];
        salary = new double[num];
        
        for (int i = 0; i < ex1.length; i++) {
            
            System.out.println("Please enter Rsi Number for TaxPayer" +(i+1));
            rsi[i] = input.nextDouble();
            System.out.println("Please enter Salary for TaxPayer " + (i+1));
            salary[i] = input.nextDouble();
            ex1[i]= new TaxPayer((int) rsi[i],salary[i]);
         
          
            
        }
        
        for (int i = 0; i < ex1.length; i++) {
            
            System.out.println(ex1[i]);
            
        }
    }
    
}
