/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrockband;

/**
 *
 * @author Howie
 */
public class Person {

    private String name;

    public Person() {

        name = "";

    }

    public Person(String nameIn) {

        name = nameIn;

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

    public String toString() {

        String s;

        s = "\t\t " + name ;
        return s;

    }
}
