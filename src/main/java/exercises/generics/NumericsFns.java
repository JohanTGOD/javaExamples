package exercises.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

//Number It's an abstract class it can not be intance instead of It can be inheritance

interface SerVivo extends Comparable<SerVivo> {

}

class Johan implements Comparable<Johan> {

    private String name;
    private Integer age;

    @Override
    public int compareTo(Johan o) {
        return this.age.compareTo(o.age);
    }
}


class Person implements SerVivo {
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(SerVivo o) {
        return 0;
    }
}

class Animal implements SerVivo {

    @Override
    public int compareTo(SerVivo o) {
        return 0;
    }
}

public class NumericsFns<T extends Number> {
    T currentNumber;

    NumericsFns(T ob) {
        this.currentNumber = ob;
    }

    UnaryOperator<Number> squareWithFunction = value -> value.doubleValue() * value.doubleValue();

    double square() {
        return currentNumber.intValue() * currentNumber.doubleValue();
    }

    // ? still achieving with the previous rule that is <T extends Number>
    boolean absEqual(NumericsFns<?> ob) {
        if ((Math.abs(currentNumber.doubleValue())) == (Math.abs(ob.currentNumber.doubleValue())))
            return true;
        return false;
    }

    private void test() {
        Person person = new Person("joha", "mora", 45);
        Animal animal = new Animal();
        person.compareTo(animal);
        Johan johan1 = new Johan();
        Johan johan2 = new Johan();

        System.out.println(johan1.compareTo(johan2));

        List<SerVivo> serVivos = Arrays.asList(person, animal);
        List<Person> personas = Arrays.asList(person);

        Collections.sort(personas);
        Collections.sort(serVivos);
    }

}
