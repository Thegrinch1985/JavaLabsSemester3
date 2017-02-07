/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca3lab2;

import java.util.Scanner;

/**
 *
 * @author x00125128
 */
public class Ca3Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name;
        int numOfYears;
        double salary;
        int days;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter name of Employee");
        name = input.nextLine();
        System.out.println("Please enter Number of Years");
        numOfYears = input.nextInt();
        System.out.println("Please enter Salary");
        salary = input.nextDouble();
        System.out.println("Enter Days Worked");
        days = input.nextInt();
        
        SalesPerson ex1 = new SalesPerson (name,numOfYears,salary,days);
        
        for (int i = 0; i < days; i++) {
            double sales =0;
            System.out.println("Please enter number of sales per day " +(i+1) );
            sales = input.nextDouble();
            ex1.fillSales(i, sales);
        }

        ex1.print();
    }
    
}
