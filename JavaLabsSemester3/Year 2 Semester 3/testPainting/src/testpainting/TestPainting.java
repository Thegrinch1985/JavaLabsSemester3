/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpainting;

/**
 *
 * @author x00125128
 */
public class TestPainting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Material []ex1 = {new Paint("Dulux Soft Sheen", 11.52,2.0, 12.0),
        new Paint("Crown White",10.0,3,10),
        new Wallpaper("Shand Kydd", 50.0,10.06,0.52)
        ,new Flooring ("Quick Step Planked",65,1.65)
        ,new Flooring("Elka Classic Walnut",80.0,1.65)};
        
        Surface ex2 = new Surface(5.7,5.7);

        
        for (int i = 0; i < ex1.length; i++) {
            
            System.out.printf("Name: %s, Requirement:  %.2f units, Price €%.2f %n",ex1[i].getName(),ex1[i].getRequiredMaterial(ex2)
                    ,ex1[i].getPrice()* ex1[i].getRequiredMaterial(ex2));
            
            
        }
     
    }
    
    }
    

