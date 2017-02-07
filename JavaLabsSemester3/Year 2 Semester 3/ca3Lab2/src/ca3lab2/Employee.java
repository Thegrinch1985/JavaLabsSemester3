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
public class Employee {
    
    String name;
    int numOfYears;
    double salary;

    public Employee(){
    
    }
    public Employee(String name, int numOfYears, double salary) {
        this.name = name;
        this.numOfYears = numOfYears;
        this.salary = salary;
    }
    public void print(){
    
        System.out.println("Name : " + name);
        System.out.println("\nYears Of Service :"+numOfYears);;
        System.out.printf("%nSalary %,.2f €", salary);
    
    }
    
    
    
    
}
