package exercises.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

//Number It's an abstract class it can not be intance instead of It can be inheritance
interface SerVivo {

}


class Person implements SerVivo, Comparable<Person> {
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
    public int compareTo(Person o) {
        return getLastName().compareTo(o.getLastName());
    }
}

class Animal implements SerVivo, Comparable<Animal> {

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}

class Johan extends Person {

    public Johan(String name, String lastName, int age) {
        super(name, lastName, age);
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

    void test() {
        Johan johan = new Johan("johan0", "d", 33);
        Animal animal = new Animal();
        // System.out.println("First comparation "+ johan.compareTo(animal));


        Johan johan1 = new Johan("johan1", "c", 33);
        Johan johan2 = new Johan("Johan2", "b", 33);
        Person person = new Person("person", "a", 45);
        System.out.println("Second comparation " + johan1.compareTo(johan2));


        List<SerVivo> serVivos = Arrays.asList(johan, johan1, johan2, animal);
        List<SerVivo> serVivos2 = Arrays.asList(johan, johan1, johan2);
        List<Person> personas = Arrays.asList(johan, johan1, johan2);
        List<Person> personas2 = Arrays.asList(johan, johan1, johan2, person);

        Collections.sort(serVivos);
        Collections.sort(serVivos2);
        Collections.sort(personas);
        Collections.sort(personas2);
    }

}