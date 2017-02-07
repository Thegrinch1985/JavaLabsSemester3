/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14ex1;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author x00125128
 */
@Entity
@Table(name ="Department")
@SuppressWarnings("SerializableClass")

public class Department   {

    @Id
    private int depID;
    private String depName;   
    
    @ManyToOne()
    @JoinColumn(name = "id")
    private University u;


    public Department() {
    }

    public Department(int deptID, String deptName) {
        this.depID = deptID;
        this.depName = deptName;
    }

    public String getDeptName() {
        return depName;
    }

    public void setDeptName(String deptName) {
        this.depName = deptName;
    }

    public int getDeptID() {
        return depID;
    }

    public void setDeptID(int deptID) {
        this.depID = deptID;
    }

    public University getU() {
        return u;
    }

    public void setU(University u) {
        this.u = u;
    }

    @Override
    public String toString() {
        return "Dep ID: " + depID + " Dep Name: " + depName +"\n";
    }
    
    
    
}