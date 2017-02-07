/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaca3lab1;

/**

 * @author x00125128
 */
public class JavaCA3Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Engineer ex1 = new Engineer(101,"Jane Smith","2378675D",120345.27);
        Admin ex2 = new Admin (304,"Bill Munroe","0978654V",75002.34);
        Manager ex3 = new Manager(207,"Barbara Johnson","87654444T",109501.36,"European Marketing");
        Director ex4 = new Director(122,"Susan Wheeler","987766565D",120567.36,"Global Marketing",1000000.00);
        
        Employee ex5[] = {ex1,ex2,ex3,ex4};
        
        for (int i = 0; i < ex5.length;i++)
        {
        
            System.out.println(ex5[i].toString());
        }
        ex3.raiseSalary(10000.0);
        ex3.setName("Barbara Johson-Smith");
        
           for (int i = 0; i < ex5.length;i++)
        {
        
            System.out.println(ex5[i].toString());
        }
    }
    
}
