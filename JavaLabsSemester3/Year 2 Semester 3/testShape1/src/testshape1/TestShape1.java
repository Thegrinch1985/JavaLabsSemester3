/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshape1;

import static java.lang.Byte.MAX_VALUE;
import static java.lang.Byte.MIN_VALUE;

/**
 *
 * @author Howie
 */
public class TestShape1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Shape shapes[];

        shapes = new Shape[]{new Circle(22, 88, 4, 4), new Square(71, 96, 10, 10), new Sphere(8, 89, 2, 2, 2), new Cube(79, 61, 8, 8, 8)};
        

        Paint ex1 = new Paint(70);
        double total = 0;
        String name = "";
        String name1 = "";

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getName() + shapes[i].toString());
            System.out.println("\nAmount of Paint required for " + shapes[i].getName()
                    + " is " +  String.format("%,.2f",ex1.calcAmount(shapes[i])) + " Litres\n");

            if (shapes[i] instanceof Circle) {

                Circle c = (Circle) shapes[i];
                c.getName();

            } else if (shapes[i] instanceof Square) {

                Square s = (Square) shapes[i];
                s.getName();
            } else if (shapes[i] instanceof Sphere) {

                Sphere sp = (Sphere) shapes[i];
                sp.getName();
            } else if (shapes[i] instanceof Cube) {

                Cube cu = (Cube) shapes[i];
                cu.getName();
            }
        }

        for (int i = 0; i < shapes.length; i++) {

            double max = i;
            int temp = 0;
            if (ex1.calcAmount(shapes[i]) >= max) {

                max = temp;
                temp = i;

            }
            name = shapes[temp].getName();
            total += ex1.calcAmount(shapes[i]);

        }
        for (int i = 0; i < shapes.length; i++) {

            double min = i;
            int temp = 0;
            if (ex1.calcAmount(shapes[i]) < min) {

                min = temp;
                temp = i;

            }
            name1 = shapes[temp].getName();

        }

        System.out.printf("The total amount of Paint Required is : %.2f %n" , total);
        System.out.println("The name of the shape with the most paint is : " + name);
        System.out.println("The name of the shape with the least paint is : " + name1);
        System.out.println("Number of Shapes Created " + Shape.counter);

    }

}
