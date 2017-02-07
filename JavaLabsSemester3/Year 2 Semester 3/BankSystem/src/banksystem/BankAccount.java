/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

/**
 *
 * @author Howie
 */
public class BankAccount {

    private String name;
    private double number;
     double balance;

    public BankAccount() {
        name = "";
        number = 0;
        balance = 0;
    }

    public BankAccount(String nameIn, double numberIn, double balanceIn) {
        name = nameIn;
        number = numberIn;
        balance = balanceIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void lodge(double lodgement){
        balance += lodgement;
    
    }
    public void withdraw(double withdrawal){
        balance -= withdrawal;
    
    }
    public String toString(){
    return "Name : "+ name + "\nNumber : " + number + "\nBalance : " + balance + "\n";
    }
    public void transfer(double amountTransfer, BankAccount a){
        
        a.withdraw(amountTransfer);
        
    
    }
   

}
