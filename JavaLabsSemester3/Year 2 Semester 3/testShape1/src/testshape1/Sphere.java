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
public class Sphere extends ThreeDShape {

    public Sphere(int s1, int s2, int s3, int s4, int s5) {

        super(s1, s2, s3, s4, s5);

    }

    public String getName() {

       return "Sphere";
    }
    public double getRadius(){
       return super.getLength();
    
    
    }
    public int getArea(){
        
        double area = 0;
        area = (((4*Math.PI)*getRadius())*getRadius());
        return (int) area;
    
    }
    public int getVolume(){
        
        double volume = 0;
        volume = ((((4.0/3.0*Math.PI)*(getRadius())*getRadius())*getRadius()));
        return (int) volume;
    
    }
    public String toString(){
        String s;
        s = super.toString() + "Radius ;" + getRadius() +
                "\nArea of " +getName() + " is:" + getArea()
                + "\nVolume of a "+getName()+ " is : " +
                getVolume()+ "\n";
        return s;
    
    }

}
