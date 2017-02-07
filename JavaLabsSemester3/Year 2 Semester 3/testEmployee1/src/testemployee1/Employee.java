/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testemployee1;

/**
 *
 * @author x00125128
 */
public class Employee {

    private int employee_id;
    private String name;
    private String rsiNumber;
    private double salary;

    public Employee() {

        employee_id = 0;
        name = "";
        rsiNumber = "";
        salary = 0;

    }

    public Employee(int employee_idIn, String nameIn, String rsiNumberIn, double salaryIn) {

        employee_id = employee_idIn;
        name = nameIn;
        rsiNumber = rsiNumberIn;
        salary = salaryIn;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getRsiNumber() {
        return rsiNumber;
    }

    public void setRsiNumber(String rsiNumber) {
        rsiNumber = rsiNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        salary = salary;
    }

    public void raiseSalary(double salaryIn) {

        salary += salaryIn;

    }
    public void print(){
        
        System.out.println("Name : \t"+ name);
        System.out.println("Employee ID :\t"+ employee_id);
        System.out.println("RSI Number : \t "+ rsiNumber);
        System.out.printf("Salary : %,.2f \n" , salary);
    
    
    }

}
