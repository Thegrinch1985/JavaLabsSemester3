/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubbishcollection;

/**
 *
 * @author Howie
 */
public class RefuseTruck {

    private int maxBins;
    private int noOfBinsDeclined;
    private int noOfBinsCollected;
    private int ratePerKg;
    private int totalWeight;

    public RefuseTruck() {

        maxBins = 0;
        noOfBinsDeclined = 0;
        noOfBinsCollected = 0;
        ratePerKg = 0;
        totalWeight = 0;

    }

    public RefuseTruck(int maxBinsIn, int noOfBinsDeclinedIn,
            int noOfBinsCollectedIn, int ratePerKgIn, int totalWeightIn) {

        maxBins = maxBinsIn;
        noOfBinsDeclined = noOfBinsDeclinedIn;
        noOfBinsCollected = noOfBinsCollectedIn;
        ratePerKg = ratePerKgIn;
        totalWeight = totalWeightIn;

    }

    public void collectBin(int weight) throws BinOverWeightException {
        if (weight < 100) {
            noOfBinsDeclined++;
            throw new BinOverWeightException();
            //System.out.println("Bin is over the 100Kg weight - collection declined");

        } else {
            System.out.println("Bin Collected");
            noOfBinsCollected++;
            setTotalWeight(totalWeight + weight);
        }
    }

    public void printStats() {

        System.out.println("No of Bins Collected " + noOfBinsCollected + " bins");
        System.out.println("No of bins Bins Declined " + noOfBinsDeclined + " bins");
        System.out.println("Average Weight of bins collected is : " + (totalWeight / noOfBinsCollected) + "kg");
        System.out.println("Average Cost of bins collected is €" + ratePerKg * (noOfBinsCollected / noOfBinsCollected));

    }

    /**
     * @return the maxBins
     */
    public int getMaxBins() {
        return maxBins;
    }

    /**
     * @return the noOfBinsDeclined
     */
    public int getNoOfBinsDeclined() {
        return noOfBinsDeclined;
    }

    /**
     * @return the noOfBinsCollected
     */
    public int getNoOfBinsCollected() {
        return noOfBinsCollected;
    }

    /**
     * @return the ratePerKg
     */
    public int getRatePerKg() {
        return ratePerKg;
    }

    /**
     * @return the totalWeight
     */
    public int getTotalWeight() {
        return totalWeight;
    }

    /**
     * @param maxBins the maxBins to set
     */
    public void setMaxBins(int maxBins) {
        this.maxBins = maxBins;
    }

    /**
     * @param noOfBinsDeclined the noOfBinsDeclined to set
     */
    public void setNoOfBinsDeclined(int noOfBinsDeclined) {
        this.noOfBinsDeclined = noOfBinsDeclined;
    }

    /**
     * @param noOfBinsCollected the noOfBinsCollected to set
     */
    public void setNoOfBinsCollected(int noOfBinsCollected) {
        this.noOfBinsCollected = noOfBinsCollected;
    }

    /**
     * @param ratePerKg the ratePerKg to set
     */
    public void setRatePerKg(int ratePerKg) {
        this.ratePerKg = ratePerKg;
    }

    /**
     * @param totalWeight the totalWeight to set
     */
    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

   

   class BinOverWeightException extends Exception {

        public BinOverWeightException() {
            super("Bin is over the 100KG weight"
                    + " - Collection Declined");
        }
    }

}
