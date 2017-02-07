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
public abstract class TwoDShape extends Shape {

    private int a;
    private int b;

    public TwoDShape(int x1, int y1, int a1, int b1) {

        super(x1, y1);
        a = a1;
        b = b1;

    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }
    public abstract int getArea();

}
