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
public class Circle extends TwoDShape {

    public Circle(int x1, int y1, int a1, int b1) {

        super(x1, y1, a1, b1);

    }

    public String getName() {

        return "Circle";

    }
    public int getRadius(){
        return super.getA();
        
        
  
    
    }
    public int getArea(){
        double area = 0;
        
        area = (Math.PI*getRadius()* getRadius());
        
        return (int) area;
    
    }
    public String toString(){
        String s;
        
        s = super.toString() + " radius :" + getRadius() + "\nArea of a "+getName()+" is "+ getArea() +" \n";
        return s;
    
    
    }

}
