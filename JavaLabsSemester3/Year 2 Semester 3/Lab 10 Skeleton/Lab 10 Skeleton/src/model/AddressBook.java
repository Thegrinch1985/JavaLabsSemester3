package model;

import db.ContactOperations;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AddressBook {

    private String owner;
    private ArrayList<Contact> clist;
    private ResultSet rset;
    private ContactOperations co;

    public AddressBook(String o, ContactOperations co) {
        this.co = co;
        owner = o;
        clist = new ArrayList<>();
    }

    public Contact getContact(int i) {
        return clist.get(i);
    }

    public String getOwner() {
        return owner;
    }

    public int getNumContacts() {
        return clist.size();
    }

    public void showContacts() {
        for (int i = 0; i < clist.size(); i++) {
            System.out.printf("%-2d %-10s %-30s %-15s%-15s\n",
                    clist.get(i).getID(), clist.get(i).getName(), clist.get(i).getAddress(),
                    clist.get(i).getPhoneNumber(), clist.get(i).getEmail());
        }
    }

    
    public void fillList() {

        try {
            rset = co.getContacts();
            System.out.println("Getting Contacts ");
            while (rset.next()) {
                Contact a = new Contact(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5));
                clist.add(a);
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());

        }

    }

    public int findContact(int id) {
        int position = -1;
        for (int i = 0; i < clist.size(); i++) {

            if (clist.get(i).getID() == id) {
                position = i;
            }

        }
        return position;
    }

    public void updateContact(int id, String newNum) {

        int index = findContact(id);
        if (index == -1) {
            System.out.println("Sorry Record Not Found");
        } else {

            clist.get(index).setPhoneNumber(newNum);
            co.updateRecord(id, newNum);
        }

    }

    public void updateName(int id, String name) {

        int index = findContact(id);
        if (index == -1) {
            System.out.println("Sorry Record Not Found");
        } else {

            clist.get(index).setName(name);
            co.updateRecord(id, name);
        }

    }

    public void updateAddress(int id, String address) {

        int index = findContact(id);
        if (index == -1) {
            System.out.println("Sorry Record Not Found");
        } else {

            clist.get(index).setAddress(address);
            co.updateRecord(id, address);
        }

    }

    public void updateEmail(int id, String email) {

        int index = findContact(id);
        if (index == -1) {
            System.out.println("Sorry Record Not Found");
        } else {

            clist.get(index).setEmail(email);
            co.updateRecord(id, email);
        }

    }



    public void removeContact(int idDelete) {

        int index = findContact(idDelete);
        if (index == -1) {
            System.out.println("Sorry Record Not Found");
        } else {

            clist.remove(index);
            co.deleteRecord(index);

        }
    }

    public void addContact() {
        rset = co.getContacts();

        try {
            if (rset.last()) {
                Contact a = new Contact(rset.getInt(1), rset.getString(2), rset.getString(3),
                        rset.getString(4), rset.getString(5));
                clist.add(a);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
