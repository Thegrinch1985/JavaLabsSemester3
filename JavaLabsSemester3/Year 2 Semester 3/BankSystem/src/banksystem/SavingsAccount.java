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
public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String nameIn, double numberIn, double balanceIn,
            double interestRateIn) {

        super(nameIn, numberIn, balanceIn);
        interestRate = interestRateIn;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void withdraw(double withdrawAmount) {
        if (getBalance() >= withdrawAmount) {
            double balance = getBalance();
            double total = balance - withdrawAmount;
            setBalance(total);
        } else {
            System.out.println("Insufficient Funds");
        }

    }
}
