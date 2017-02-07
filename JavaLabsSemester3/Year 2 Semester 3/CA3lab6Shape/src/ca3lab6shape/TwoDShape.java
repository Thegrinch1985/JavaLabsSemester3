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
public abstract class TwoDShape extends Shape{
    
    private int x1, y1;

    public TwoDShape(int x, int y,int x1, int y1) {
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }
    public abstract int getArea();
    
}
