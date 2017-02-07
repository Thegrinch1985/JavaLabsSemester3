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
public class Sphere extends ThreeDShape {

    public Sphere(int x2, int y2, int z2, int x, int y) {
        super(x2, y2, z2, x, y);
    }

    @Override
    public String getName() {

        return "Sphere";

    }

    public int getRadius() {

        return 0;
    }

    @Override
    public int getArea() {

        int area = 0;

        area = (int) (4 * Math.PI * getRadius() * getRadius());

        return area;

    }

    @Override
    public int getVolume() {
        int volume = 0;

        volume = (int) (4 / 3 * Math.PI * (getRadius() * getRadius()) * getRadius());
        return volume;
    }

    @Override
    public String toString() {
        return "("+ getX() +"," + getY()+")"+ "Radius " + getRadius();
    }
    
    

}
