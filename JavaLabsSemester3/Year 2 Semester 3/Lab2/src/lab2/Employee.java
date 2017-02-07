/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author x00125128
 */
public class Employee {

    String name;
    int yearsOfService;
    double salary;

    public Employee() {

        name = "";
        yearsOfService = 0;
        salary = 0;

    }
    public Employee(String nameIn, int yearsOfServiceIn, double salaryIn){
        
        name = nameIn;
        yearsOfService = yearsOfServiceIn;
        salary = salaryIn;
    
    
    }
    
    public void print(){
    
        System.out.println("Name : \t " + name);
        System.out.println("Years Of Service \t" + yearsOfService);
        System.out.println("Salary : \t " + salary);
    }

}
