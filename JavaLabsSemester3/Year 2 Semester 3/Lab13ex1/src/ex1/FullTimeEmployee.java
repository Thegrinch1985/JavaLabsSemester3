/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

   import javax.persistence.*;
/**
 *
 * @author x00125128
 */
@Entity
@Table(name = "EMPLOYEE13")
@DiscriminatorValue(value="FT")
public class FullTimeEmployee extends Employee{
    
    private double salary;
    
    
    
    public FullTimeEmployee(){
        
        salary = 0;
    
    }
    public FullTimeEmployee(int idIn, String nameIn, String startDateIn,double salaryIn){
        
        super(idIn,nameIn, startDateIn);
        salary = salaryIn;
    
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
    @Override
      public String toString() {
       
        return  super.toString()+ "\tSalary : "+ salary+"\t";

    }
}
