package functional.optional;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalTest {
    private static final String CURRENT_VALUE = "validation";

    public static void main(String[] args) {
        //firstTest(null);
        //thirdTest("null");
//        fourthTest(null);
        fithTest(null);
    }

    static void firstTest(String word) {
        Optional<String> newWord = Optional.ofNullable(word);
        System.out.println(newWord.isPresent());
        //The difference between orElse and orElseGet it is:
//      Thought orElse is not used always is goingt to create the object
//     If orElseGet is not going to invoque anything if is not called
        System.out.println(newWord.orElse("dsd").equals(CURRENT_VALUE));
        System.out.println(newWord.orElseGet(() -> "dsd").equals(CURRENT_VALUE));
    }

    static void secondTest(String word) {
        Optional<String> newWord = Optional.ofNullable(word);
        newWord.orElseThrow(NoSuchElementException::new);
    }

    static void thirdTest(String word) {
        Optional<String> newWord = Optional.ofNullable(word);
        newWord.ifPresent(System.out::println);
    }

    static void fourthTest(String word) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

    }

    static void fithTest(String word) {
        List<String> companyNames = Arrays.asList(
                "paypal", "oracle", "", "microsoft", "", "apple");
        Optional<List<String>> listOptional = Optional.of(companyNames);
        int size = listOptional
                .map(List::size)
                .orElse(0);
        System.out.println(size);
    }
}
