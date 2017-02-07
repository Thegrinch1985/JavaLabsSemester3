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
public class CurrentAccount extends BankAccount {

    private int freeTranasction;
    private int feePerTranasctions = 2;
    private double overDraftLimit;
    private int tranactionCount;

    public CurrentAccount(String nameIn, double numberIn, double balanceIn,
            int freeTranasctionIn, double overDraftLimitIn) {

        super(nameIn, numberIn, balanceIn);
        freeTranasction = freeTranasctionIn;
        overDraftLimit = overDraftLimitIn;
        tranactionCount = 0;

    }

    public void lodge(double amount) {
        double balance = getBalance();
        double total = balance + amount;
        setBalance(total);
        tranactionCount++;

    }

    public void withdraw(double withdrawAmount) {

        if (getBalance() >= withdrawAmount) {
            double balance = getBalance();
            double total = balance - withdrawAmount;
            setBalance(total);
            tranactionCount++;
        } else if ((getBalance() + overDraftLimit) >= withdrawAmount) {
            double balance = getBalance();
            double total = balance - withdrawAmount;
            setBalance(total);
            tranactionCount++;
        } else {
            System.out.println("Insufficient Funds");
        }

    }
    public double calcFees(){
        
        double fees = (tranactionCount - freeTranasction) * feePerTranasctions;
        balance -= fees;
        return fees;
    
    }
    public String toString(){
    
        return super.toString() + "Number Free Transaction" + freeTranasction+ 
                "Transaction Fee : " + feePerTranasctions + 
                "OverDraft Limit " + overDraftLimit + 
                "Number of transaction on " + getName() + "s account are" + tranactionCount;
    }

    public int getFreeTranasction() {
        return freeTranasction;
    }

    public void setFreeTranasction(int freeTranasction) {
        this.freeTranasction = freeTranasction;
    }

    public int getFeePerTranasctions() {
        return feePerTranasctions;
    }

    public void setFeePerTranasctions(int feePerTranasctions) {
        this.feePerTranasctions = feePerTranasctions;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public int getTranactionCount() {
        return tranactionCount;
    }

    public void setTranactionCount(int tranactionCount) {
        this.tranactionCount = tranactionCount;
    }

}
