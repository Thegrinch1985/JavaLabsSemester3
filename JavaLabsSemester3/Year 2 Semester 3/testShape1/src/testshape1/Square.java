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
public class Square extends TwoDShape {

    public Square(int x1, int y1, int a1, int b1) {

        super(x1, y1, a1, b1);

    }

    public String getName() {
        return "Square";

    }

    public int getSide() {

        return super.getA();

    }

    public int getArea() {

        return (int) getSide() *getSide();

    }

    public String toString() {

        String s;
        s = super.toString() + "side :"+ getSide() + "\n"
                + "Area of " + getName() + " is :" + getArea()
              +"\n";
        return s;

    }

}

