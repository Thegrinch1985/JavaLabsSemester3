/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshape;

/**
 *
 * @author x00125128
 */
public class TestShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Shape[] shapes = {new Rectangle("Rectangle","Red",4, 5), new Triangle("Triangle","Blue",4.0, 5.0), new Circle("Circle","Black",9.0), new Cyclinder("Cyclinder", "Indigo", 5.0, 9.0)};

        for(int i = 0; i < shapes.length;i++)
        {
            System.out.println("-------------------------------------");
            System.out.println("Shape :"+(i+1)+ ("\n")+shapes[i]);
            shapes[i].calcArea();
            if(shapes[i] instanceof Cyclinder)
            {
            Cyclinder c = (Cyclinder)shapes[i];
            c.calcVolume();
            }
           
      

        }

    }

}
