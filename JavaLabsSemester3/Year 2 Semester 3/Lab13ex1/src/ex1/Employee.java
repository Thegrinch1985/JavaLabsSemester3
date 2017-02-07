/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;


    import javax.persistence.*;
/**
 *
 * @author x00125128
 */
@Entity
@Table (name= "Employee13")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "type")

@SuppressWarnings("SerializableClass")
public class Employee {
    @Id

    private int id;
    private String name;
    private String startDate;

    public Employee() {

        id = 0;
        name = "";
        startDate = "";

    }

    public Employee(int idIn, String nameIn, String startDateIn) {

        id = idIn;
        name = nameIn;
        startDate = startDateIn;

    }

    @Override
    public String toString() {

        return "Employee id :" + id + "\tName : " + name + "\t Start Date : " + startDate;

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
