/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16;

/**
 *
 * @author x00125128
 */
public class Invoice implements iPayable {

    private String description;
    private double number;
    private double price;
    private double quantity;

    public Invoice() {

    }

    public Invoice(double quantity, double price, double number, String description) {

        this.description = description;
        this.number = number;
        this.price = price;
        this.quantity = quantity;
        HourlyEmployee.invoices++;

    }

    @Override
    public double getPaymentAmount() {

        double amount = 0;
        double tax = 0;
                

       
        tax =  ((price * quantity) / 100) * VAT_RATE;
        amount = (price * quantity)+tax;
        HourlyEmployee.total += tax;
        
        
        return amount;

    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the number
     */
    public double getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(double number) {
        this.number = number;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public double getQuantity() {
        return quantity;
    }

    public String toString() {

        return "Invoice "+ "\nQuantity : \t\t\t " + quantity + "\nPricePerItem :  \t\t  " + price + "\nNumber : \t\t\t"
                + number + "\nPart Description :\t\t " + description
                + "\nAmount Due : \t\t\t€" +  String.format("%.2f",getPaymentAmount())
                +"\n**************************************" + "\n";

    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

}
