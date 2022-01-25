package exercises.generics;

import java.util.LinkedList;

class SortedList<T extends Comparable<? super T>> extends LinkedList<T> {
    T ob;

    SortedList(T ob) {
        this.ob = ob;
        System.out.println("attempt");
    }

}

public class GenericsTest {
    public static void main(String[] args) {
        System.out.println("//-------------------First Test------------------------------------");
        NumericsFns<Double> test1 = new NumericsFns<>(6.0);
        NumericsFns<Double> test2 = new NumericsFns<>(7.0);
        System.out.println(test1.squareWithFunction.apply(5));
        System.out.println(test2.square());

        System.out.println("//-------------------Other Test------------------------------------");

        NumericsFns<Integer> iOb = new NumericsFns<>(6);
        NumericsFns<Double> dOb = new NumericsFns<>(-6.5);

        System.out.println(iOb.absEqual(dOb));
    }
}
