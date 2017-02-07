/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaddressbook;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Howie
 */
public class AddressBook {

    private String owner;
    static int numberPPL;
    ArrayList<Contact> contactList = new ArrayList<Contact>();
    
    final int MINLENGTH = 9;

    /**
     * @return the owner
     */
    public AddressBook(String ownerIn) {

        owner = ownerIn;

    }

    public String getOwner() {
        return owner;
    }

    public class Contact {

        private String name;
        private char gender;
        private String number;

        public Contact(String nameIn, char genderIn, String numberIn) {

            name = nameIn;
            gender = genderIn;
            number = numberIn;
            numberPPL++;

        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @return the gender
         */
        public char getGender() {
            return gender;
        }

        /**
         * @return the number
         */
        public String getNumber() {
            return number;
        }

    }

    /**
     * @return the numberPPL
     */
    public static int getNumberPPL() {
        return numberPPL;
    }

    public void fillList() {

        Scanner input = new Scanner(System.in);

        Random r = new Random();
        int num = 1 + r.nextInt(2);

        for (int i = 0; i < num; i++) {
            String name;
            char gender;
            String number;
            System.out.println("Enter Name for contact" + (i + 1));
            name = input.nextLine();
            System.out.println("enter Gender (M or F) for contact" + (i + 1));
            String gender1 = input.nextLine();
            gender = gender1.charAt(0);
            System.out.println("Enter mobile for contact" + (i + 1));
            number = input.nextLine();
            /*while (number.length() <= MINLENGTH) {
                System.out.println("Telephone Number to short please input a telephone Number with 10 numbers ");
                System.out.println("Enter mobile for contact" + (i + 1));
                number = input.nextLine();

            }
*/
            {

            }

            contactList.add(new Contact(name, gender, number));

        }

    }

    public void print() {

        for (int i = 0; i < contactList.size(); i++) {
            System.out.println("Address Book Belongs to : " + getOwner()
                    + "\nName : \t " + contactList.get(i).getName()
                    + "\nNumber " + contactList.get(i).getNumber()
                    + "\nGender : " + contactList.get(i).getGender());
        }

    }

    public int genderList() {
        int number = 0;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getGender() == 'M' || contactList.get(i).getGender() == 'm') {
                number++;

            }
        }
        return number;

    }

}
