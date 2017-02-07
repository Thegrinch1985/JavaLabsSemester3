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
@Table(name = "University1")
@SuppressWarnings("SerializableClass")
public class University {

    @Id
    @Column(name="uniId")
    private int id;
    private String uName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "DepUni",
    joinColumns = @JoinColumn(name = "uniId"),
    inverseJoinColumns = @JoinColumn(name = "depId"))
    
    
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
}
