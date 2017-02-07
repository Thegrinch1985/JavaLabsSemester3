/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14ex1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author x00125128
 */
@Entity
@Table(name = "University")
//@Inheritance(strategy = InheritanceType.JOINED)
@SuppressWarnings("SerializableClass")

public class University implements Serializable {
    @Id
    
    private int id;
    private String uName;
    @OneToMany(mappedBy = "u",orphanRemoval=true)
    private List<Department> deptlist = new ArrayList<>();

    
    public University() {
    }
    
    public University(int id, String uName) {
        this.id = id;
        this.uName = uName; 
    }
    
    public String getuName() {
        return uName;
    }
    
    public void setuName(String uName) {
        this.uName = uName;
    }

    public List<Department> getDeptlist() {
        return deptlist;
    }

    public void setDeptlist(List<Department> deptlist) {
        this.deptlist = deptlist;
    }
    


    @Override
    public String toString() {
        String s = "University ID: " + id + " Name: " + uName + "\n";
        for (int i = 0; i < deptlist.size(); i++) {
            s += deptlist.get(i);
        
        }
        return s;
    }
    
    public void changedeptname(String old, String newname) {
       
        for (int i = 0; i < deptlist.size(); i++) {
            if (deptlist.get(i).getDeptName().equals(old)) {
                deptlist.get(i).setDeptName(newname);
            }
        }
    }
    public void addContact(Department name){
        
        deptlist.add(name);
        name.setU(this);
        
        
        
        
        
      
   
    }
}