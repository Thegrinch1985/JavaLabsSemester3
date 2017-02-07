/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14ex1;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author x00125128
 */
public class Lab14ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab14ex1PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        University u1 = new University(1, "ITT");
        em.persist(u1);

        University u2 = new University(2, "UCD");
        em.persist(u2);
        Department u1d1 = (new Department(1, "Computing"));
        em.persist(u1d1);
        u1.addContact(u1d1);

        Department u1d2 = (new Department(2, "Business"));
        em.persist(u1d2);
        u1.addContact(u1d2);

        Department u1d3 = (new Department(3, "Languages"));
        em.persist(u1d3);
        u1.addContact(u1d3);

        Department u1d4 = (new Department(4, "Engineering"));
        em.persist(u1d4);
        u1.addContact(u1d4);

        Department u2d5 = (new Department(5, "Arts"));
        em.persist(u2d5);
        u2.addContact(u2d5);

        Department u2d6 = (new Department(6, "Medicine"));
        em.persist(u2d6);
        u2.addContact(u2d6);

        Department u2d7 = (new Department(7, "Sceince"));
        em.persist(u2d7);
        u2.addContact(u2d7);

        em.getTransaction().commit();

        System.out.println(u1);
        System.out.println(u2);
//
//        em.getTransaction().begin();
//        em.remove(u1d3);
//        u1.getDeptlist().remove(u1d3);
//        System.out.println(u1);
//        em.getTransaction().commit();

        em.getTransaction().begin();
        u1.getDeptlist().remove(u1d3);
        em.getTransaction().commit();
        System.out.println(u1);

       // System.out.println(u1);
        em.getTransaction().begin();
        u1.changedeptname(u1d2.getDeptName(), "Business & Marketing");
        em.getTransaction().commit();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Space Here to Check Queries");
        System.out.println(u1);
        System.out.println(u2);
        queryData();
    }

    public static void queryData() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab14ex1PU");
        EntityManager em = emf.createEntityManager();
        //System.out.println("hello hello");
        TypedQuery<University> query
                = em.createQuery("SELECT u from University u ", University.class);
        List<University> results = query.getResultList();

        for (University u : results) {
            System.out.println(u);
        }
        em.close();
        emf.close();

    }
}
