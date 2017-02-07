/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmagichat;

import java.util.Random;

/**
 *
 * @author x00125128
 */
public class MagicHat {

    private Rabbit[] rabbits;
    private static int num = 5;
    private static Random r = new Random();
    private String hatName;

    static class Rabbit {

        private static String[] rabbitName = {"Jack", "Fred", "Joe", "Shep"};
        private static int[] id = new int[rabbitName.length];
        private String name;

        public Rabbit() {

            int index = r.nextInt(rabbitName.length);
            name = rabbitName[index] + (++id[index]);

        }

        public String toString() {

            String s;
            s = name;

            return s;
        }

    }

    public MagicHat(String name) {
        hatName = name;
        rabbits = new Rabbit[1 + r.nextInt(num)];

        for (int i = 0; i < rabbits.length; i++) {
            rabbits[i] = new Rabbit();

        }

    }
    public String toString(){
        
        String s;
        s = hatName + " contains \n";
        
         for(int i = 0; i < rabbits.length;i++)
            {
               s+= " " + rabbits[i];
            
            }
    
    return s;
    }

}
