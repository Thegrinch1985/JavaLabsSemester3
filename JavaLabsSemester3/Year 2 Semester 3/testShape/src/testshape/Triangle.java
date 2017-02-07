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
public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle() {

        base = 0;
        height = 0;

    }

    public Triangle(String typeIn, String colourIn,double baseIn, double heightIn) {

        super(typeIn, colourIn);
        base = baseIn;
        height = heightIn;
    }

    public String toString() {

        String s;

        s = super.toString() + String.format("Base  :\t "+ base+ " width :\t"+ height);
        return s;

    }

    @Override
    public void calcArea() {

        System.out.println("Area \t : " + (.5 * base * height));

    }
}
