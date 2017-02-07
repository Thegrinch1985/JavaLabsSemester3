/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author x00125128
 */
@Entity
@Table(name = "Employee")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Type")

public class Employee implements Serializable {

    @Id
    private int id;
    private String name;
    private String startDate;

    public Employee(int id, String name, String startdate) {
        this.id = id;
        this.name = name;
        this.startDate = startdate;
    }

    public Employee() {
    }

    public String toString() {
        return "Employee Id:" + getId() + "\tName: " + getName() + "\t" + "Start Date" + getStartDate();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
