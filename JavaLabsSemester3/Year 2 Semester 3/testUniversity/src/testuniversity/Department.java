/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testuniversity;

/**
 *
 * @author x00125128
 */
public class Department {

    private int departmentID;
    private String departmentName;

    public Department() {

        departmentID = 0;
        departmentName = "";

    }
    public Department(int departmentIDIN, String departmentNameIn){
        
        
        departmentID = departmentIDIN;
        departmentName = departmentNameIn;
    
    
    }

  
    public int getDepartmentID() {
        return departmentID;
    }

    
    public void setDepartmentID(int departmentIDIn) {
        departmentID = departmentIDIn;
    }

   
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentNameIn) {
        departmentName = departmentNameIn;
    }

}
