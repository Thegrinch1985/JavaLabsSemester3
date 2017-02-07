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
public class TextFriend1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number of friends you wiah toadd to the phonebook");
        int n = input.nextInt();
        input.nextLine();
        Friend[] ex1 = new Friend[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter name of friend " + (i + 1));
            String name = input.nextLine();
            
            System.out.println("Please enter Number of Friend " + (i+1));
            String number = input.nextLine();

            ex1[i] = new Friend(name, number);

        }
        for (int i = 0; i < ex1.length; i++) {
            
            System.out.println(ex1[i]);

        }
        System.out.println("Please enter name of friend you wish to update");
        String uName = input.nextLine();
        
        for(int i = 0; i < n;i++)
        {
        if(ex1[i].nameIn(uName)== false)
        {
            System.out.println("Name not in book");
        }
        else if (ex1[i].nameIn(uName)== true){
            System.out.println("Please enter the new number for " + ex1[i].getName());
            ex1[i].setNumber(input.nextLine());
        }
        }
           for (int i = 0; i < ex1.length; i++) {
            
            System.out.println(ex1[i]);

        }
        
        
      
        

    }

}
