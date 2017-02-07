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
@DiscriminatorValue("FT")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class FullTimeEmployee extends Employee {

    @Column(name="salary")
    private double salary;

    public FullTimeEmployee() {

    }

    public FullTimeEmployee(int id, String name, String startdate, double salaryIn) {

        super(id, name, startdate);
        salary = salaryIn;

    }

    @Override
    public String toString() {

        return super.toString() + "\t Salary : " + getSalary();

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

}
