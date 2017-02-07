/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14ex2a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Department1")
//@SuppressWarnings("SerializableClass")

public class Department implements Serializable {

    @Id
    private int depID;
    private String depName;
    @ManyToMany(mappedBy = "deptlist")

  

    private List<University> ulist = new ArrayList<>();

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

    public List<University> getUlist() {
        return ulist;
    }

    public void setUlist(List<University> ulist) {
        this.ulist = ulist;
    }

    public void addUni(University u) {
        ulist.add(u);
        u.getDeptlist().add(this);
    }

    public void removeUni(University u) {
        ulist.remove(u);
        u.getDeptlist().remove(this);
    }

    public void remove() {
        ArrayList<University> temp = new ArrayList<>(ulist);
        for (int i = 0; i < temp.size(); i++) {
            removeUni(temp.get(i));
        }
    }

    
    @Override
    public String toString() {
        return "Dep ID: " + depID + " Dep Name: " + depName + "\n";
    }
}
