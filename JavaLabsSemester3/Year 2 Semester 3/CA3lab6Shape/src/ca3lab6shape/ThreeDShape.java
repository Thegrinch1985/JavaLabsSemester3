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
public abstract class ThreeDShape extends Shape{

    private int x2,y2,z2;

    public ThreeDShape(int x2, int y2, int z2, int x, int y) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getZ2() {
        return z2;
    }
    
    public abstract int getArea();
    
    public abstract int getVolume();
    
    

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
