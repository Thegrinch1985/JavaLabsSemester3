/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmagichat;

/**
 *
 * @author x00125128
 */
public class TestMagicHat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MagicHat ex1 = new MagicHat("Grey Hat");
        System.out.println(ex1);
         MagicHat ex2 = new MagicHat("Black Hat");
        System.out.println(ex2);
         MagicHat ex3 = new MagicHat("Baseball Cap");
        System.out.println(ex3);
        
        MagicHat.Rabbit ex4 = new MagicHat.Rabbit();
        System.out.println("Rabbit outside is " + ex4);
        

    }
    
}
