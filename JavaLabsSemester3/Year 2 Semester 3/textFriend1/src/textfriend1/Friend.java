/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfriend1;

import java.util.Scanner;

/**
 *
 * @author Howie
 */
public class Friend {

    private String name;
    private String number;
    private boolean result;
    Scanner input = new Scanner(System.in);

    public Friend() {

        name = "";
        number = "";

    }

    public Friend(String nameIn, String numberIn) {

        name = nameIn;
        number = numberIn;
       
            /*
        while(numberIn.length() != 10)
        {
            System.out.println("Phone Number must be ten digits, Please re-enter digits");
            number = input.nextLine();
            
        }
        */
        
      

    }
    public boolean nameIn(String nameIn){
        
        if(nameIn.equals(name))
        {
        return true;
        }
        else {
        
        return false;}
    
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    public String toString() {

        String s;

        s = "Name : " + name + "\t\n" + "Number " + number + "\n";
        return s;

    }
/*
    public boolean updateContact(String nameIn) {

        if (nameIn.equals(name)) {
            System.out.println("Please enter The Number of " + name);
            return true;
        } else {
            System.out.println("Contact" + nameIn + "not found");
            return false;
        }

    }
*/
}
