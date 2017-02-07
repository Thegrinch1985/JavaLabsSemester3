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
public class Circle extends TwoDShape {

    public Circle(int x, int y, int x1, int y1) {
        super(x, y, x1, y1);
    }

    public int getRadius(){
    return getX();
    }
    @Override
    public int getArea() {
        int area = 0;
        
        area = (int) (Math.PI * getRadius() *getRadius());
        
    return area;
    }

    @Override
    public String getName() {
    
    return "Circle";
    }

    @Override
    public String toString() {
        return "("+ getX() +"," + getY()+"radius"+ getRadius();
    }
    
    
    
}
