package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection {

    public static void main(String[] args) {

        Person person = new Person("Johan", "Mora", 10);
        Person person4 = new Person("Johan1", "Mora", 10);
        Person person1 = new Person("Johan2", "Mora2", 11);
        Person person2 = new Person("Johan3", "Mora3", 12);
        Person person3 = new Person("Johan4", "Mora4", 13);
        Person person5 = new Person("Johan", "Mora", 10);
        Person person6 = person;

        List<String> aso = new ArrayList<String>();
        Set<Person> listOfPersons = new HashSet<Person>();
        listOfPersons.add(person);
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(person3);
        listOfPersons.add(person4);
        listOfPersons.add(person5);
        listOfPersons.add(person6);

        System.out.println(person.toString());

        for (Person p : listOfPersons) {
            System.out.println(p.getName());
        }

        System.out.println("if validation");

        if (person.equals(person5)) {
            System.out.println("I come in");
        } else {
            System.out.println("I come out");
        }

    }
}
