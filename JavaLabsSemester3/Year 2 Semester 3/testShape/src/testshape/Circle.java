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
public class Circle extends Shape {

    protected double radius;

    public Circle() {

        radius = 0;

    }

    public Circle(String typeIn, String colourIn,double radiusIn) {
        super(typeIn, colourIn);
        radius = radiusIn;
      

    }

    public String toString() {

        String s;

        s = super.toString() +String.format("Radius " + radius);

        return s;

    }
    public void calcArea(){
        
        System.out.printf("Area %.2f %n", (Math.PI*radius*radius));
    
    }

}
