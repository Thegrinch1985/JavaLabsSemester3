/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpainting;

/**
 *
 * @author x00125128
 */
public class Wallpaper extends Material {

    private double length, width;

    public Wallpaper(String name, double price, double length, double width) {
        super(name, price);
        this.length = length;
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    @Override
    public double getRequiredMaterial(Surface s) {

          double amount =(((((s.getWidth() * s.getLength()) / 100)*80)*4)
            / (getLength()*getWidth()));

        return amount;

    }
  

}
