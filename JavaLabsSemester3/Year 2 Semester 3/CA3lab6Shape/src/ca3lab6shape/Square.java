/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca3lab6shape;

/**
 *
 * @author Howie
 */
public class Square extends TwoDShape {

    public Square(int x, int y, int x1, int y1) {
        super(x, y, x1, y1);
    }

    @Override

    public int getArea() {
        int area = 0;
        area = getX() * getX();

        return area;
    }

    public int getSide() {

        return getX();
    }

    @Override
    public String getName() {

        return "Square";
    }

    @Override
    public String toString() {
        return "("+ getX() +"," + getY()+"side" +getSide();
    }

    
}
