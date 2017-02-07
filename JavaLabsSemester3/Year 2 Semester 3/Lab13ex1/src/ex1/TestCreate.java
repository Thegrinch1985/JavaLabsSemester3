/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author x00125128
 */
public class TestCreate {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab13ex1PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction()
                .begin();
        //System.out.println("hello");
        FullTimeEmployee ft1 = new FullTimeEmployee(6, "George", "01/Jan/2016", 65000);

        em.persist(ft1);
        PartTimeEmployee pt1 = new PartTimeEmployee(7, "Mary", "11/Apr/2015", 30, 40);

        em.persist(pt1);

        em.getTransaction()
                .commit();
        queryData();
        //TestDelete();
    }

    public static void queryData() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab13ex1PU");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Employee> query = em.createQuery("Select e FROM Employee e order by e.id", Employee.class);
        List<Employee> results = query.getResultList();
        for (Employee e : results) {
            System.out.println(e);
        }
        em.close();
        emf.close();
    }

    public static void TestDelete() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab13ex1PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        int deletedCount = em.createQuery("DELETE FROM "
                + "Employee e WHERE e.id = 6").executeUpdate();
        System.out.println(deletedCount + " entity removed");
         em.getTransaction().commit();
        queryData();
        em.close();
        emf.close();

    }

}
