/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca3lab2;

/**
 *
 * @author x00125128
 */
public class SalesPerson extends Employee {

    double[] sales;

    public SalesPerson(String name, int numOfYears, double salary, int numOfSales) {
        super(name, numOfYears, salary);
        sales = new double[numOfSales];
    }

    public void fillSales(int day, double amount) {

        sales[day] = amount;

    }
 public void print() {

        super.print();
        double total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }

        System.out.printf("%nTotalSales €%,.2f %n" , total);
        double minSales = Double.MAX_VALUE;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
            }

        }
        System.out.printf("Min Sales €%,.2f %n" , minSales);
        double maxSales = Double.MIN_VALUE;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
            }

        }
        System.out.printf("Max Sales €%,.2f %n " ,maxSales);
        double noSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == 0) {
                noSale++;
            }
        }
        System.out.println("Number of days with no Sales  \t" + noSale);;

    }


}
