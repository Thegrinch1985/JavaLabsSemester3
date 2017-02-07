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
public class Paint {

    private double coverage;

    public Paint(double coverageIn) {

        coverage = coverageIn;

    }

    public double calcAmount(Shape shapeIn) {
        double calcAmount = 0;
        if (shapeIn instanceof Circle) {
            Circle s = (Circle) shapeIn;
            calcAmount = (s.getArea() / coverage);

        }
        else if (shapeIn instanceof Square)
        {
        Square s = (Square) shapeIn;
            calcAmount = (s.getArea()/ coverage);

        }
          else if (shapeIn instanceof Sphere)
        {
        Sphere s = (Sphere) shapeIn;
            calcAmount = (s.getArea() / coverage);

        }
          else if (shapeIn instanceof Cube)
        {
        Cube s = (Cube) shapeIn;
            calcAmount = (s.getArea() / coverage);

        }

        return calcAmount;
    }

}
