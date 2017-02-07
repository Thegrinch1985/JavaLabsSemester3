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
public class Surface {
    
    private double length,width;

    public Surface(double length, double width) {
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
    
    public double calcArea(){
        double area = ( getWidth()*getLength());
    return area;
    };
    
}
