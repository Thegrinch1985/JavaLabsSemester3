/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testemployee2;

/**
 *
 * @author x00125128
 */
public class Manager extends Employee {

    private String departmentName;

    public Manager(int employee_idIn, String nameIn, String rsiNumberIn, double salaryIn, String departmentNameIn) {

        super(employee_idIn, nameIn, rsiNumberIn, salaryIn);
        departmentName = departmentNameIn;

    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {

        String finalString = super.toString();
        String formattedString = String.format(" Department Name  \t\n"+ departmentName);
        finalString +=formattedString;

        return finalString;

    }

}
