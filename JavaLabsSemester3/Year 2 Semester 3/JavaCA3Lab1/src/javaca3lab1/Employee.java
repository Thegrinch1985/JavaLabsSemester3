/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaca3lab1;

/**
 *
 * @author x00125128
 */
public class Employee {

    private int employee_id;
    private String name;
    private String rsiNumber;
    private double salary;

    public Employee(int employee_id, String name, String rsiNumber, double salary) {
        this.employee_id = employee_id;
        this.name = name;
        this.rsiNumber = rsiNumber;
        this.salary = salary;
    }

    /**
     * @return the employee_id
     */
    public int getEmployee_id() {
        return employee_id;
    }

    /**
     * @param employee_id the employee_id to set
     */
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the rsiNumber
     */
    public String getRsiNumber() {
        return rsiNumber;
    }

    /**
     * @param rsiNumber the rsiNumber to set
     */
    public void setRsiNumber(String rsiNumber) {
        this.rsiNumber = rsiNumber;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double amount) {

        salary += amount;

    }

    @Override
    public String toString() {
        return  "Employee_id : " + employee_id + "\nName :" + name + "\nRsiNumber :" + rsiNumber + "\nSalary :" + String.format("%,.2f",salary)  ;
    }
  

}
