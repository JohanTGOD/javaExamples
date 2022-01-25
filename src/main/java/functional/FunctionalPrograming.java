package functional;

import java.util.function.Function;

public class FunctionalPrograming {

    public static void main(String[] args) {

        Function<Integer, Integer> multiplyBy3 = number -> number * 3;

        Function<Integer, Integer> numberToMultiply = multiplyBy3.compose(
                number -> number + 2
        );

        Function<Integer, Integer> resolve = numberToMultiply.andThen(number -> number - 1);

        System.out.println(numberToMultiply.apply(5));
        System.out.println(resolve.apply(5));

        System.out.println();
    }
}
