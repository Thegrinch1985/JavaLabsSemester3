/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testemployee1;

/**
 *
 * @author x00125128
 */
public class TestEmployee1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Engineer ex1 = new Engineer(101,"Jane Smith","2378675D",120345.27);
        Admin ex2 = new Admin(304,"Bill Munroe","0978654V",75002.34);
        Manager ex3 = new Manager(207,"Barbara Johnson","8765667w",109501.36,"European Marketing");
        Director ex4 = new Director(122,"Susan Wheeler","9876547B",120567.36,1000000.00,"Global Marketing");
        
        ex3.raiseSalary(10000);
        ex3.setName("Barbara Johnson - Smyth");
        
        ex1.print();
        ex2.print();
        ex3.print();
        ex4.print();
        
        
    }
    
}
