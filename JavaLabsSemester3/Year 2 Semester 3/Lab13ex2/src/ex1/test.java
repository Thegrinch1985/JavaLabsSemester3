/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author x00125128
 */
import java.util.List;
import javax.persistence.*;

public class test {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab13ex2PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        FullTimeEmployee ft1 = new FullTimeEmployee(6, "George", "01/Jan/2016", 6500);
        em.persist(ft1);
       
        PartTimeEmployee pt1 = new PartTimeEmployee(7, "Mary", "11/Apr/2015", 30, 40);
        em.persist(pt1);

        
        queryData();
       
        queryData2();
    queryData1();
        em.getTransaction().commit();

    }

    public static void queryData() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab13ex2PU");
        EntityManager em = emf.createEntityManager();

        TypedQuery<PartTimeEmployee> query
                = em.createQuery("SELECT i from PartTimeEmployee i ", PartTimeEmployee.class);
        List<PartTimeEmployee> results = query.getResultList();

        for (Employee e : results) {
            System.out.println(e);
        }
        em.close();
        emf.close();

    }
        public static void queryData1() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab13ex2PU");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Employee> query
                = em.createQuery("SELECT e from Employee e ", Employee.class);
        List<Employee> results = query.getResultList();

        for (Employee e : results) {
            System.out.println(e);
        }
        em.close();
        emf.close();

    }
         public static void queryData2() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab13ex2PU");
        EntityManager em = emf.createEntityManager();

        TypedQuery<FullTimeEmployee> query
                = em.createQuery("SELECT f from FullTimeEmployee f ", FullTimeEmployee.class);
        List<FullTimeEmployee> results = query.getResultList();

        for (FullTimeEmployee e : results) {
            System.out.println(e);
        }
        em.close();
        emf.close();

    }

}
