package functional.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional2 {

    public static void main(String[] args) {
        List<Integer> names = getNames();
        boolean integerStream = names.stream().map(v -> v.compareTo(3)).allMatch(x->x==1);

//        getNames().forEach(item -> item);
//        getOptionalNames().ifPresent(item -> item. forEach(System.out::println));

    }

    static List<Integer> getNames() {
        List<Integer> strings = Arrays.asList(1, 2, 3);
        return strings;
    }

    static Optional<List<Integer>> getOptionalNames() {
        return Optional.of(getNames());
    }
}
