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
public class Cube extends ThreeDShape {

    public Cube(int x2, int y2, int z2, int x, int y) {
        super(x2, y2, z2, x, y);
    }

    public String getName() {

        return "Cube";

    }

    public int getSide() {

        return getX();

    }

    @Override
    public int getArea() {

        double area = 0;

        area = 6 * getX() * getX();

        return (int) area;
    }

    @Override
    public int getVolume() {
        
        int volume = 0;
        
        volume = getX() * getX() *getX();
        
        return volume;
    }
    public String toString(){
        
        return "("+ getX() +"," + getY()+")"+ "Radius " + getSide();
    
    }

}
