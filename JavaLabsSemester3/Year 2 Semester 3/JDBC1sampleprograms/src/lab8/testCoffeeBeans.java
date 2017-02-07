/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author x00125128
 */

public class testCoffeeBeans {
    
      public static void main(String[] args){
          
          
       ContactsDB1 ex1 = new ContactsDB1();
       
       
       ex1.openDB();
       ex1.dropTables();
       ex1.buildContactsTable();
       ex1.showDB();
       ex1.queryDB2();
        ex1.queryDB1();
        ex1.insert(4, "Howie Lynch","15 Geoffrey Keating Road Dublin 8", "0982134232", "hl@gmail.com");
        ex1.showDB();
        ex1.closeDB();
      
       
               }
}
