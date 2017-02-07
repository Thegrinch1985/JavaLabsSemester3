/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbService;

/**
 *
 * @author x00125128
 */
import java.util.List;
import javax.persistence.*;
import ex1.AddressBookOwner;
import ex1.Contact;

public class JPAService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaApplication15PU");
    EntityManager em = emf.createEntityManager();

    public int findOwnerID(String owner) {

        int ownerID = 0;
        Query query = em.createQuery("Select o.id FROM AddressBookOwner o "
                + "Where o.name=:value", AddressBookOwner.class).setParameter("value", owner);
        try {

            ownerID = (int) query.getSingleResult();
        } catch (NoResultException e) {
            System.out.println("Nothing Found " + e.getMessage());

        }
        return ownerID;
    }

    public boolean findOwner(String owner) {

        int id = findOwnerID(owner);
        boolean found = false;
        AddressBookOwner abo = em.find(AddressBookOwner.class, id);

        if (abo != null) {
            found = true;

        }
        return found;
    }

    public void updateContact(int cid, String newNum) {

        em.getTransaction().begin();
        Contact c = em.find(Contact.class, cid);
        c.setPhoneNumber(newNum);
        em.getTransaction().commit();
    }

    public void printAllContacts(String owner) {

        int id = findOwnerID(owner);

        Query q = em.createNativeQuery("SELECT C.ID, C.CNAME, C.ADDRESS,"
                + " C.PNUMBER, C.EMAIL FROM CONTACTS C ,"
                + " CONTACTSADDRESSBOOK CAB\n"
                + "where C.ID = CAB.CID\n "
                + "and CAB.ABID=" + id, Contact.class);
        List<Contact> results = q.getResultList();

        for (Contact c : results) {
            System.out.println(c);

        }

    }

    public boolean findContact(int cid, String owner) {

        System.out.println("In here Contact ID" + cid);
        boolean found = false;
        int ownerid = findOwnerID(owner);

        Query q = em.createNativeQuery("Select C.PNUMBER\n"
                + " FROM CONTACTS C, CONTACTSADDRESSBOOK CAB\n"
                + "where C.ID = CAB.CID\n"
                + "and CAB.ABID = " + ownerid
                + "and c.id = " + cid);

        List<Contact> results = q.getResultList();

        if (!results.isEmpty()) {
            found = true;
        }
        return found;

    }

    public void removeContact(int idDelete) {

        Contact c = em.find(Contact.class, idDelete);
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();

    }

    public Contact createContact(String nameAdd, String addAdd, String emailAdd, String numAdd, String owner) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int id = findOwnerID(owner);
        AddressBookOwner abo = em.find(AddressBookOwner.class, id);
        em.getTransaction().begin();
        Contact c = new Contact(nameAdd, addAdd, emailAdd, numAdd);
        c.addOwner(abo);
        em.getTransaction().commit();
        return c;

    }

}
