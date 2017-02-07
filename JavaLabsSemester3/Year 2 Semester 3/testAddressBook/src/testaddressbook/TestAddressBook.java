/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaddressbook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Howie
 */
public class TestAddressBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         ArrayList<AddressBook> ex1 = new ArrayList<AddressBook>();

        for (int i = 0; i < 2; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter the owner of address book " + (i + 1));
            String name = input.nextLine();
            ex1.add(new AddressBook(name));
            ex1.get(i).fillList();

        }
        for (int i = 0; i < ex1.size(); i++) {

            ex1.get(i).print();
            System.out.println("Number of Male friends are " + ex1.get(i).genderList());
           

        }
         System.out.println("Total Contacts " + AddressBook.getNumberPPL());

    }

}
