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
public class Cube extends ThreeDShape {
    
    public Cube(int x1, int y1, int s1a, int s2b, int s3c){
        
        super(x1, y1,s1a,s2b,s3c);
    
    }
    public String getName(){
        
        return "Cube";
    
    }
    public int getSide(){
        
        return super.getLength();
    
    }
    public int getArea(){
        
        double area = 0;
        area = ((6 * getSide()) * getSide());
        return (int) area;
    
    }
    public int getVolume(){
        double volume = 0;
        volume = ((getSide() * getSide()) * getSide());
        return (int) volume;
    
    }
    public String toString(){
        
        String s; s = super.toString() + "side :" + getSide()
                +"\nArea of "+getName()+" is :" + getArea()+"\nVolume of"
                +getName() +" is : " + getVolume() +"\n";
        return s;
    
    }
    
}
