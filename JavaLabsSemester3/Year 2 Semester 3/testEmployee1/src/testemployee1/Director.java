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
public class Director extends Manager {

     double budget;

    public Director(int employee_idIn, String nameIn, String rsiNumberIn, double salaryIn, double budgetIn, String departmentNameIn) {

        super(employee_idIn, nameIn, rsiNumberIn, salaryIn,departmentNameIn);
        budget = budgetIn;

    }
   

}
