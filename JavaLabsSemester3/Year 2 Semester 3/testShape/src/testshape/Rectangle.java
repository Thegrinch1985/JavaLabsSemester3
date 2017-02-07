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
public class Rectangle extends Shape {
    
    
    private double length;
    private double width;
    
    
    public Rectangle (){
    
        length = 0;
        width = 0;
    }
    public Rectangle(String typeIn, String colourIn, double lengthIn, double widthIn){
        
        super(typeIn, colourIn);
        length = lengthIn;
        width = widthIn;
    
    }
    
    @Override
    public String toString(){
    
        String s;
        
        
        s = super.toString() + String.format("Length \t : " + length + " width : " + width);
        
        return s;
    }
    @Override
    public void calcArea()
    {
        System.out.println("Area : \t " + (length*width));
    }
}
