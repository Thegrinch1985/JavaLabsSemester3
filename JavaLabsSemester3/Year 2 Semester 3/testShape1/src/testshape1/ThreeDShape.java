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
public abstract class ThreeDShape extends Shape {

    private int s1, s2, s3;

    public ThreeDShape(int x1, int y1, int s1a, int s2b, int s3c) {

        super(x1, y1);
        s1 = s1a;
        s2 = s2b;
        s3 = s3c;

    }

    public int getLength() {

        return s1;

    }

    public int getWidth() {

        return s2;

    }

    public int getHeight() {

        return s3;

    }
    public abstract int getArea();
    public abstract int getVolume();

}
