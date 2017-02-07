/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14ex2a;

import javax.persistence.*;

/**
 *
 * @author Howie
 */
public class Lab14ex2a {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        emf = Persistence.createEntityManagerFactory("Lab14ex2aPU");
        em = emf.createEntityManager();
        
         em.getTransaction().begin();
         
         University u1 = new University(2,"UCD");
         em.persist(u1);
         University u2 = new University(1,"ITT");
         em.persist(u2);
         
         Department d1 = new Department(1,"Computing");
         d1.addUni(u2);
         
         Department d2 = new Department(2,"Business");
         d2.addUni(u2);
         
         Department d3 = new Department(3,"Languages");
         d3.addUni(u2);
         
         Department d4 = new Department(4,"Engineering");
         d4.addUni(u2);
         
//         Department d8 = new Department(7,"Sceince");
//         d8.addUni(u2);
         
         Department d5 = new Department(5,"Arts");
         d5.addUni(u1);
         
         Department d6 = new Department(6,"Medicine");
         d6.addUni(u1);
         
         Department d7 = new Department(7,"Sceince");
         d7.addUni(u1);
         d7.addUni(u2);
          em.getTransaction().commit();
         System.out.println(u2);
         System.out.println(u1);
             em.getTransaction().begin();
         d7.remove();
         em.persist(d7);
         
         em.getTransaction().commit();
         //d8.remove();
         System.out.println(u2);
         System.out.println(u1);
         
         
         

    }

}
