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
public abstract class Shape {

    protected String type;
    protected String colour;
    private double area;

    public Shape() {

        type = "";
        colour = "";
        area = 0;

    }

    public Shape(String typeIn, String colourIn) {

        type = typeIn;
        colour = colourIn;
        area = 0;

    }

    public String toString() {

        String s;

        s = "Type of Shape is  : " + type + "\nColour of Shape is :" + colour + "\n";   
        return s;

    }
    public abstract void calcArea();

    
}
