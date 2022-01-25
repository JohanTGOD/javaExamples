package collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("joha,", "mora", 12));
        people.add(new Person("jepp", "mora", 12));
        people.add(new Person("johhh,", "mora", 12));
        people.add(new Person("cloi,", "mora", 12));
        people.add(new Person("trim,", "mora", 12));
        people.add(new Person("joha,", "mora", 12));

        people.forEach( System.out::println);

    }
}
