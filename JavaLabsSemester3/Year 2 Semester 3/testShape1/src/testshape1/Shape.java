/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshape1;

/**
 *
 * @author Howie
 */
public abstract class Shape {

    private int x;
    private int y;
    static int counter = 0;

    public Shape(int x1, int y1) {

        x = x1;
        y = y1;
        counter++;

    }
    public int getCounter(){
        
        return counter;
    
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    public String toString() {

        String s;
        

        s = "(" + getX() + "," + getY()+")" ;
        return s;

    }
    public abstract String getName();
}
