/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author x00125128
 */
public class Lab19ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> colours = new ArrayList();
        HashSet<String> hset = new HashSet<>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Yellow");
        colours.add("Blue");
        colours.add("Pink");
        hset.add("Red");
        hset.add("Green");
        hset.add("Yellow");
        hset.add("Blue");
        hset.add("Pink");
        
        System.out.println(hset);
         Iterator ex1 = colours.iterator();

//        for (int i = 0; i < colours.size(); i++) {
//            
//            colours.remove(i);
//            System.out.println(colours);
//            
//        }
//   
// Cannot remove all as once it deletes one, size decreases
//        for (Object colour : colours) {
//            
//            colours.add(colour);
//            System.out.println(colours);
//        }
//    }
//        Iterator ex1 = colours.iterator();
//        while (ex1.hasNext()) {
//
//            System.out.println(ex1.next());
//
//            ex1.remove();
//           
//
//        }
//        colours.add("aaa");
//         System.out.println(ex1);
//////     
////        for (String colour : colours) {
////            ex1.remove();
////           System.out.println(colour);
////           
////        }
//        System.out.println(colours);
    }
}
