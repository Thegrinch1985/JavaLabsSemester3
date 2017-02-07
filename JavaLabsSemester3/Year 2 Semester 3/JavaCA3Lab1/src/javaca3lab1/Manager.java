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
public class Manager extends Employee {
    
    String dep_name;

    public Manager(int employee_id, String name, String rsiNumber, double salary, String dep_name) {
        super(employee_id, name, rsiNumber, salary);
        this.dep_name = dep_name;
    }

    public String getDep_name() {
        return dep_name;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nDepartment Name :" + dep_name;
    }
    
    
    
}
