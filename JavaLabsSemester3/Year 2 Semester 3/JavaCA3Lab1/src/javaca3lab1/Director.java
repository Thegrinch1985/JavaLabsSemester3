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
public class Director extends Manager {
    
    double budget;

    public Director( int employee_id, String name, String rsiNumber, double salary, String dep_name, double budget) {
        super(employee_id, name, rsiNumber, salary, dep_name);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String getDep_name() {
        return dep_name;
    }

    @Override
    public String toString() {
        return  super.toString()+ " \nBudget : " + budget + "\n"
                + "                                                 ";
    }
    
    
    
    
}
