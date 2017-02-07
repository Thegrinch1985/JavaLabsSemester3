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
@DiscriminatorValue("PT")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class PartTimeEmployee extends Employee {

    private double hours;
    private double rate;

    public PartTimeEmployee() {

    }

    public PartTimeEmployee(int id, String name, String startdate, double hoursIn, double rateIn) {

        super(id, name, startdate);
        hours = hoursIn;
        rate = rateIn;

    }

    public String toString() {

        return super.toString() + "\thours : " + hours + "\t rate :" + rate;

    }

    /**
     * @return the hours
     */
    public double getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

}
