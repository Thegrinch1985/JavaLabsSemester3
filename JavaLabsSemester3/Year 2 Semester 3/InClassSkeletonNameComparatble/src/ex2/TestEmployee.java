package ex2;


import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {

    public static void main(String[] args) {
        ArrayList<Employee> persons = new ArrayList<>();

        persons.add(new Employee("Donnell", "John", 34));
        persons.add(new Employee("Collins", "Tony", 18));
        persons.add(new Employee("Greally", "Jim ", 16));
        persons.add(new Employee("Brady", "Noel", 69));

        Collections.sort(persons, new NameComparator());
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }

}
