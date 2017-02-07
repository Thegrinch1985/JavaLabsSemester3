/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshape;

/**
 *
 * @author x00125128
 */
public class Cyclinder extends Circle {

    private double height;
    private double volume;

    public Cyclinder() {

        height = 0;
        volume = 0;

    }

    public Cyclinder(String typeIn, String colourIn, double radiusIn, double heightIn) {

        type = typeIn;
        colour = colourIn;
        radius = radiusIn;
        height = heightIn;
        volume = 0;

    }

    @Override
    public String toString() {

        String s;
        s = super.toString() + "\nHeight of Cyclinder is \t " + height;
        return s;

    }
    @Override
    public void calcArea(){
        
        System.out.printf("Area : %.2f %n",((2*Math.PI*radius*radius )+(2*Math.PI*radius*height)) );
    
    
    }
    public void calcVolume(){
        
        System.out.printf("Volume  : %.2f %n",(Math.PI*radius*radius*height));
    
    }

}
