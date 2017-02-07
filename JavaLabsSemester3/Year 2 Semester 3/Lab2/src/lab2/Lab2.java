/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author x00125128
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        int numYears;
        double salary;
        int days;
        System.out.println("Please enter your Name ");
        name = input.nextLine();
        System.out.println("Please enter the Number of Years you have been with the Company");
        numYears = input.nextInt();
        System.out.println("Please enter your Salary");
        salary = input.nextDouble();
        System.out.println("Please enter number of day Sales");
        days = input.nextInt();
        SalesPerson ex1 = new SalesPerson(name, numYears, salary, days);

        for (int i = 0; i < days; i++) {
            double sales = 0;
            System.out.println("Please enter number of Sales for day " + (i+1));
            sales = input.nextDouble();
            ex1.fillSales(i, sales);
            
            
        }
        ex1.print();

    }

}
