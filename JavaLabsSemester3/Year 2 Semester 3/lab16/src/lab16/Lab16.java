/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16;

import java.util.Scanner;

/**
 *
 * @author x00125128
 */
public class Lab16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        iPayable []array = {new Invoice(2,375,01234,"Printer"),new Invoice(4, 79.95,56789,"Ink Cartdridges"),
            new HourlyEmployee("John","Smith","1234567N",30,60),new HourlyEmployee("Lisa","Kelly","9865431M",12,20),
            new HourlyEmployee("Mary","Reilly","987776N",8,20)};
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.println(array[i]);
           
            
        }
        System.out.println("The total Number of Employees :\t" + HourlyEmployee.getNumofEmployees());
        System.out.println("The Number of Invoices : \t" + HourlyEmployee.getInvoices());
        System.out.printf("The total amount of Vat : \t€%.2f %n" , HourlyEmployee.getTotal());
        System.out.printf("The total amount of tax paid is : \t€%.2f %n" , HourlyEmployee.getTotalTax());
        }
        
        
  

        

    }


